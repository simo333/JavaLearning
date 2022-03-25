package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ParentNotSerializable {
    public static void main(String[] args) throws Exception{
        try (
                FileOutputStream out = new FileOutputStream("object.data");
                ObjectOutputStream oos = new ObjectOutputStream(out);
                FileInputStream in = new FileInputStream("object.data");
                ObjectInputStream ois = new ObjectInputStream(in);
        ) {
            Car c = new Car();
            oos.writeObject(c);
            oos.flush();
            Car c2 = (Car) ois.readObject();
            System.out.println(c2.name + " : " + c2.model);
        }

    }
}
