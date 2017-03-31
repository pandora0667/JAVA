package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by seongwonlee on 2017. 3. 18..
 */
public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/seongwonlee/Workspace/JAVA");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
    }
}
