package FileChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by seongwonlee on 2017. 4. 2..
 */
public class FileChannelWriteExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/seongwonlee/Workspace/file.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(
                path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        String data = "Hello, Seong Won.";
        Charset charset = Charset.defaultCharset();
        ByteBuffer byteBuffer = charset.encode(data);

        int byteCount = fileChannel.write(byteBuffer);
        System.out.println("file.txt : " + byteCount + "byte written");

        fileChannel.close();
    }
}
