public class Book{

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    private String name;
    private String isbn;

    private static Book book = new Book();

    private Book(){

    }
    public Book getInstance(){
        if (book != null){
            return book;
        }
        else return new Book();
    }

}