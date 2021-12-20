package bousso;

public class Reader {

    private final String ID;
    private final String name;
    private final String surname;
    
    
    

    public Reader(String iD, String name, String surname) {
        ID = iD;
        this.name = name;
        this.surname = surname;
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
    /*public static Reader getInstance(){
        if (reader != null) return reader;
        else return new Reader();
    }*/
    
}
