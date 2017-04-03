package WirteObject.ReadObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by seongwonlee on 2017. 4. 3..
 */
public class Child extends Parent implements Serializable {
    public String field2;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(field1);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in ) throws  IOException, ClassNotFoundException {
        field1 = in.readUTF();
        in.defaultReadObject();
    }
}
