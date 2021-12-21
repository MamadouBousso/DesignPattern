package bousso;

import java.lang.reflect.Constructor;

public class ReflectionApp {

    public ReflectionApp(BPSingleton bps){
        BPSingleton bps1 = BPSingleton.getInstance();
        BPSingleton bps2;
        Constructor[] constructors = bps.getClass().getDeclaredConstructors();
        for(Constructor c: constructors){
            c.setAccessible(true);
            bps2 = (BPSingleton) c.newInstance();
        }

    }
    
}
