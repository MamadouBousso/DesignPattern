package bousso;

public class ProxyImage implements Image{

    private RealImage rlImage;

    @Override
    public void display() {
        // TODO Auto-generated method stub
        rlImage.display();
    }

    
    
}
