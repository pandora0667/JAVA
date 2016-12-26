/**
 * Created by jusk2 on 2016-12-26.
 * Enum Method Example
 */
public class EnumMethodExample {
  public static void main(String[] args) {
    //name() 메소드, 열거 객체가 가지고 있는 문자열을 리턴
    Week today = Week.SUNDAY;
    String name = today.name();
    System.out.println(name);

    //ordinal() 메소드, 전체 열거 객체 중 몇번째 열거 객체인지 알려준다.
    int ordinal = today.ordinal();
    System.out.println(ordinal);

    //compareTo() 메소드, 매개값으로 주어진 열거객체를 기준으로 전(-)후(+)의 몇 번째 위치하는지 알려준다.
    Week day1 = Week.MONDAY;
    Week day2 = Week.WEDNESDAY;
    int result1 = day1.compareTo(day2); // day2를 기준으로
    int result2 = day2.compareTo(day1); // day1을 기준으로
    System.out.println(result1);
    System.out.println(result2);

    //valueOf() 메소드, 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
    if (args.length == 1) {
      String strDay = args[0];
      Week weekDay = Week.valueOf(strDay);
      if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY)
        System.out.println("주말이다!!");
      else
        System.out.println("평일!!");
    }

    //values() 메소드, 열거 타입의 모든 열거 객테들을 배열로 만들어 리턴
    Week[] days = Week.values();
    for (Week day : days)
      System.out.print(day + ", ");
  }
}
