package bousso;

public class Reader {

    private String name;
    private String surname;
    public static Reader reader = new Reader();

    private Reader(){

    }
    public static Reader getInstance(){
        if (reader != null) return reader;
        else return new Reader();
    }
    
}
