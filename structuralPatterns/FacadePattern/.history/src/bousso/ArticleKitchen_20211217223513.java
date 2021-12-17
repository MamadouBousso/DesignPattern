package bousso;

public class ArticleKitchen extends Article{

    public ArticleKitchen(String name, String price) {
        super(name, price);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fabriquerArticle() {
        // TODO Auto-generated method stub
        System.out.println("I built kitchen articles");
    }
    
}
