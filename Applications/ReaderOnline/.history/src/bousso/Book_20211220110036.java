package bousso;

import java.util.ArrayList;
import java.util.List;

public class Book{

    private final String name;
    private final String isbn;
    private final List<String> pages;

    public Book(String name, String isbn, List<String> pages) {
        this.name = name;
        this.isbn = isbn;
        this.pages = pages;
    }
    public String getName() {
        return name;
    }
    public List<String> getPages() {
        return pages;
    }
    
    
    public String getIsbn() {
        return isbn;
    }
    
    /*public static Book getInstance(){
        if (book != null){
            return book;
        }
        else return new Book();
    }*/

}