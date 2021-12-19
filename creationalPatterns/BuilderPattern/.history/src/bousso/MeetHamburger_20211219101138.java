package bousso;

public class MeetHamburger extends Hamburger{

    public MeetHamburger(String name, float price, Packing packing) {
        super(name, price, packing);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("I am a meat burger");
    }
    
    
}
