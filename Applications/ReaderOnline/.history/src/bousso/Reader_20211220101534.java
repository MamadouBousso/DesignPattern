package bousso;

public class Reader {

    private  String ID;
    private  String name;
    private  String surname;
    public static Reader reader = new Reader();

    private Reader(){
        

    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public static Reader getInstance(){
        if (reader != null) return reader;
        else return new Reader();
    }
    
}
