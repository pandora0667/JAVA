package Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by seongwonlee on 2017. 4. 3..
 * 직렬화 해서 파일에 저장
 */
public class SerializableWriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/seongwonlee/Workspace/Seminar/JAVA/Chapter18/src/ObjectIO/Object.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;

        objectOutputStream.writeObject(classA);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
