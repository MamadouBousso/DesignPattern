package bousso;

import java.lang.reflect.Constructor;

public class ReflectionApp {

    public ReflectionApp(BPSingleton bps){
        Constructor[] constructors = bps.getClass().getDeclaredConstructors();
        for(Constructor c: constructors){
            c.setAccessible(true);
        }

    }
    
}
