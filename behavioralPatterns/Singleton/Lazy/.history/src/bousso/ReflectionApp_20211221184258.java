package bousso;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApp {

    public ReflectionApp(BPSingleton bps){
        BPSingleton bps1 = BPSingleton.getInstance();
        BPSingleton bps2;
        Constructor[] constructors = bps.getClass().getDeclaredConstructors();
        for(Constructor c: constructors){
            c.setAccessible(true);
            try {
                bps2 = (BPSingleton) c.newInstance();
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    
}
