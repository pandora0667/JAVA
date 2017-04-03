package FileChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by seongwonlee on 2017. 4. 2..
 */
public class AsynchronousFIleChannelReadExample {
    public static void main(String[] args) throws IOException {
        // Thread Poll create
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        for (int i=0; i<10; i++) {
            Path path = Paths.get("/Users/seongwonlee/Workspace/file" + i + ".txt");

            // 비동기 파일채널 생성
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path,
                    EnumSet.of(StandardOpenOption.READ),
                    executorService
            );

            // 파일의 크기와 동일한 capacity 가지는 버퍼 생성
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)fileChannel.size());

            // 첨부 객체 생성
            class Attachment {
                Path path;
                AsynchronousFileChannel fileChannel;
                ByteBuffer byteBuffer;
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;
            attachment.byteBuffer = byteBuffer;

            // CompletionHandler
            CompletionHandler<Integer, Attachment> completionHandlernew =
                    new CompletionHandler<Integer, Attachment>() {
                        @Override
                        public void completed(Integer result, Attachment attachment) {
                            attachment.byteBuffer.flip();
                            // 버퍼에 저장된 데이터를 문자열로 복원
                            Charset charset = Charset.defaultCharset();
                            String data = charset.decode(attachment.byteBuffer).toString();

                            System.out.println(attachment.path.getFileName() + " : " + data + " : "  + Thread.currentThread().getName());

                            try {
                                fileChannel.close();
                            } catch (IOException e) {}
                        }

                        @Override
                        public void failed(Throwable exc, Attachment attachment) {
                            exc.printStackTrace();
                            try {
                                fileChannel.close();
                            } catch (IOException e) {}
                        }
                    };

            // 파일 읽기
            fileChannel.read(byteBuffer, 0, attachment, completionHandlernew);
        }
        // Thread Pool exit
        executorService.shutdown();
    }
}
