package bousso;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.event.SwingPropertyChangeSupport;

public class SerDerSingleton  {
    public static void compareSerialization(LazySingleton ls){
        String file = "./Object.ser";
        LazySingleton instance = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            fos.close();
            oos.close();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance = (LazySingleton)ois.readObject();
            fis.close();
            ois.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
