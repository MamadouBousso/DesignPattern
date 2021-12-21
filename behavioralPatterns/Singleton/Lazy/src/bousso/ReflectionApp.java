package bousso;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApp {

    public ReflectionApp(){
        

    }
    public void reflectBSP(){
        BPSingleton bps1 = BPSingleton.getInstance();
        System.out.println(bps1);
        BPSingleton bps2 = null;
        Constructor[] constructors = bps1.getClass().getDeclaredConstructors();
        for(Constructor c: constructors){
            c.setAccessible(true);
            try {
                bps2 = (BPSingleton) c.newInstance();
                System.out.println(bps2);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
