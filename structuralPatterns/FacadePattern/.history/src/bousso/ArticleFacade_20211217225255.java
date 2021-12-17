package bousso;

public class ArticleFacade {

    private Article artH;

    private Article artK;

    public Article getArtK() {
        return artK;
    }
    public Article getArtH() {
        return artH;
    }
    public void setArtH(Article artH) {
        this.artH = artH;
    }
    public void setArtK(Article artK) {
        this.artK = artK;
    }
    public ArticleFacade() {
        this.setArtH(new ArticleHouse());
        this.setArtK(new ArticleKitchen());
    }

    public void fabriquerArtH(){
        this.getArtH().fabriquerArticle();
    }

    public void fabriquerArtK(){
        this.getArtK().fabriquerArticle();
    }

}
