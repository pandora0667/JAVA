package ObjectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by seongwonlee on 2017. 4. 3..
 */
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new Integer(10));
        objectOutputStream.writeObject(new Double(3.14));
        objectOutputStream.writeObject(new int[]{ 1, 2, 3} );
        objectOutputStream.writeObject(new String("이성원"));

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Integer obj1 = (Integer) objectInputStream.readObject();
        Double obj2 = (Double) objectInputStream.readObject();
        int[] obj3 = (int[]) objectInputStream.readObject();
        String obj4 = (String) objectInputStream.readObject();

        objectInputStream.close();;
        fileInputStream.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3[0] + ", " + obj3[1] + ", " + obj3[2]);
        System.out.println(obj4);
    }
}
