package bousso;

public class Test {
    public static void main(String[] args) {
        Produit lt = new Lait("lait",100);
        ProduitDeco cafeaulait = new ProduitDeco(lt, "cafe", 50);
        System.out.println("The price of "+cafeaulait.getName()+" is "+cafeaulait.calculerPrix());
        ProduitDeco cafeaulaitcitron = new ProduitDeco(cafeaulait, "citron", 50);
        System.out.println("The price of "+cafeaulait.getName()+" is "+cafeaulait.calculerPrix());
    }
}
