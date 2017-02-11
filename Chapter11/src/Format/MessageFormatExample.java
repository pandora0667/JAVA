package Format;

import java.text.MessageFormat;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class MessageFormatExample {
  public static void main(String[] args) {
    String id = "java";
    String name = "이성원";
    String tel = "010-3025-0667";

    String text = "회원 ID : {0} \n회원이름 : {1} \n회원전화 : {2}";
    String result1 = MessageFormat.format(text, id, name, tel);
    System.out.println(result1);
    System.out.println();

    String sql = "insert into member values( {0}, {1}, {2} )";
    Object[] arguments = {"'java", "'이성원", "'010-3025-0667'"};
    String result2 = MessageFormat.format(sql, arguments);
    System.out.println(result2);
  }
}
