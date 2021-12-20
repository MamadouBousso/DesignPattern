package bousso;

import java.util.List;

public class Book{

    private String name;
    private String isbn;
    private List<String> pages;

    public String getName() {
        return name;
    }
    public List<String> getPages() {
        return pages;
    }
    public void setPages(List<String> pages) {
        this.pages = pages;
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
    
    private static Book book = new Book();

    private Book(){

    }
    public static Book getInstance(){
        if (book != null){
            return book;
        }
        else return new Book();
    }

}