package Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by seongwonlee on 2017. 4. 3..
 */
public class SerializableReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ClassA classA = (ClassA) objectInputStream.readObject();
        System.out.println("field1 : " + classA.field1);
        System.out.println("field2.field1 : " + classA.field2.field1);
        System.out.println("field3 : " + classA.field3);
        System.out.println("field4 : " + classA.field4);
    }
}
