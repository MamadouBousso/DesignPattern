package bousso;

public class Test {
    public static void main(String[] args) {
        Lait lt = new Lait("lait",100);
        ProduitDeco cafeaulait = new ProduitDeco(lt, "cafe", 50);
        System.out.println("The price of "+cafeaulait.getName()+" is "+cafeaulait.calculerPrix());
    }
}
