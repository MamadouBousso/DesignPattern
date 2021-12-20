package bousso;

public class BookDisplayer {

    private Book book;

    BookDisplayer(){
        

    }
    public void getNextPage(int number){
        System.out.println(book.getPages()[number]);
    }
    
}
