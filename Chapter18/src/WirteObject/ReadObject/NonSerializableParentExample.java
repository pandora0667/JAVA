package WirteObject.ReadObject;

import java.io.*;

/**
 * Created by seongwonlee on 2017. 4. 3..
 */
public class NonSerializableParentExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Child child = new Child();
        child.field1 = "이성원";
        child.field2 = "박찬열";
        oos.writeObject(child);
        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Child v = (Child) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2 : " + v.field2);
        ois.close();
        fis.close();

    }
}
