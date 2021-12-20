package bousso;

public class Reader {

    private final String ID;
    private final String name;
    private final String surname;
    public static Reader reader = new Reader();

    private Reader(String ID,String surname,String name){
        this.ID = ID;
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
    public static Reader getInstance(){
        if (reader != null) return reader;
        else return new Reader();
    }
    
}
