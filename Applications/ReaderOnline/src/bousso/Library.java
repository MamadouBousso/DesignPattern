package bousso;

public class Library {

    private Book b;

    private Reader r;

    public Reader getR() {
        return r;
    }
    public Book getB() {
        return b;
    }
    public void setB(Book b) {
        this.b = b;
    }
    public void setR(Reader r) {
        this.r = r;
    }
    public void deleteReader(){
        this.setR(null);
    }
}
