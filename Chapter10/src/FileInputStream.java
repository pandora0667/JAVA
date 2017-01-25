/**
 * Created by jusk2 on 2017-01-26.
 */
public class FileInputStream implements AutoCloseable {
  private String file;

  public FileInputStream(String file) {
    this.file = file;
  }

  public void read() {
    System.out.println(file + "을 읽었습니다.");
  }

  @Override
  public void close() throws Exception {
    System.out.println(file + "을 닫습니다.");
  }
}
