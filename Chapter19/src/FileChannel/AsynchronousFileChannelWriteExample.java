package FileChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by seongwonlee on 2017. 4. 2..
 */
public class AsynchronousFileChannelWriteExample {
    public static void main(String[] args) throws Exception {
        // Thread Poll Create
        ExecutorService excutorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors() // 사용가능한 프로세스 정보 가져오기
        );

        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("/Users/seongwonlee/Workspace/file" + i + ".txt");
            Files.createDirectories(path.getParent());

            // 비동기 파일 채널 생성
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path,
                    EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE),
                    excutorService
            );

            // 파일에 저장할 데이터를 ByteBuffer 저장
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode("Hello");

            // 첨부 객체 생성
            class Attachment {
                Path path;
                AsynchronousFileChannel fileChannel; // 비동기 파일 채널 저장
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;

            // CompletionHandler 객체 생성
            CompletionHandler<Integer, Attachment> completionHandler =
                    new CompletionHandler<Integer, Attachment>() {
                        @Override
                        public void completed(Integer result, Attachment attachment) {
                            // 버퍼에 저장된 데이터를 문자열로 복원

                            System.out.println(attachment.path.getFileName() + " : " + result + "byte written" + Thread.currentThread().getName());
                            try {
                                attachment.fileChannel.close();
                            } catch (Exception e) {
                            }
                        }

                        @Override
                        public void failed(Throwable exc, Attachment attachment) {
                            exc.printStackTrace();
                            try {
                                attachment.fileChannel.close();
                            } catch (IOException e) {
                            }
                        }
                    };

            fileChannel.write(byteBuffer, 0, attachment, completionHandler);
        }

        // 쓰레드폴 종료
        excutorService.shutdown();
    }
}
