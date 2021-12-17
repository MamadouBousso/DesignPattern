package bousso;

public class ArticleHouse extends Article{

    public ArticleHouse(String name, int price) {
        super(name, price);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fabriquerArticle() {
        // TODO Auto-generated method stub
        System.out.println("I build articles for House");
    }
    
}
