package com.clouway.io.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Demo {
  public static void main(String[] args) {
    Dog sammy = new Dog("Sammy", 3, "labrador");
    Dog pedro = new Dog("Pedro", 6, "pitbull");
    Path path = Paths.get("src/com/clouway/io/serial/SerialFile");
    PrettyPrint pretty = new PrettyPrint(14);
    DataClass dc = new DataClass();
    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(path, CREATE, TRUNCATE_EXISTING));
         InputStream in = new BufferedInputStream(Files.newInputStream(path))) {
      dc.saveObject(out, sammy);
      dc.saveObject(out, pedro);
      Dog obj = (Dog) dc.getObject(in);
      Dog obj2 = (Dog) dc.getObject(in);
      pretty.pPrint("NAME", obj.getName(), obj2.getName());
      pretty.pPrint("BREED", obj.getBreed(), obj2.getBreed());
      pretty.pPrint("AGE", obj.getAge(), obj2.getAge());
    } catch (ClassNotFoundException | IOException cs) {
      cs.printStackTrace();
    }
  }
}
