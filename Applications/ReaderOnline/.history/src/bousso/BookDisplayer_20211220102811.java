package bousso;

public class BookDisplayer {

    private Book book;

    public BookDisplayer(Book book){
        this.book = book;


    }
    public void getNextPage(int number){
        System.out.println(book.getPages().get(number));
    }
    
}
