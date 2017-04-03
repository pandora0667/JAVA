package Path;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by seongwonlee on 2017. 3. 31..
 */
public class FIleSystemExample {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault(); // OS File System get

        for (FileStore store : fileSystem.getFileStores()) {
            System.out.println("Driver : " + store.name());
            System.out.println("File System : " + store.type());
            System.out.println("Total Space : " + store.getTotalSpace());
            System.out.println("Using Space : " + (store.getTotalSpace() - store.getUnallocatedSpace()));
            System.out.println("Available Space : " + store.getUsableSpace());
            System.out.println();
        }

        System.out.println("파일 구분자 : " + fileSystem.getSeparator());
        System.out.println();

        for (Path path : fileSystem.getRootDirectories()) {
            System.out.println(path.toString());
        }
    }
}
