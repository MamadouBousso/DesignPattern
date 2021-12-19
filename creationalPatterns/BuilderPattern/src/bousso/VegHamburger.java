package bousso;

public class VegHamburger extends Hamburger {

    public VegHamburger(String name, float price, Packing packing) {
        super(name, price, packing);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("I am a veggie burger");
    }
    
}
