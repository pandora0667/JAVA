package Serializable;
import java.io.Serializable;

/**
 * Created by seongwonlee on 2017. 4. 3..
 * 직렬화가 가능한 클래스
 */
public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    static int field3;
    transient int field4; // 직렬화에서 제외
}
