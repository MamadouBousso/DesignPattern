public class Book{

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