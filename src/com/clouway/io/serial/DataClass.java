package com.clouway.io.serial;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class DataClass {
  /*
  Saves object to an OutputStream
   */
  public void saveObject(OutputStream out, Object o) throws IOException {
    ObjectOutputStream output = new ObjectOutputStream(out);
    output.writeObject(o);
    output.flush();
  }

  /*
  Gets an object from an InputStream
   */
  public Object getObject(InputStream in) throws IOException, ClassNotFoundException {
    ObjectInputStream input = new ObjectInputStream(in);
    return input.readObject();
  }
}
