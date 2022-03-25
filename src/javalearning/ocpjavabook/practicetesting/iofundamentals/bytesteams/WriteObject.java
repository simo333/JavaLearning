package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        try (
            FileOutputStream out = new FileOutputStream("object.data");
            ObjectOutputStream oos = new ObjectOutputStream(out);
        )
        {
            Car c = new Car();
            oos.writeObject(c);
        }

    }
}
