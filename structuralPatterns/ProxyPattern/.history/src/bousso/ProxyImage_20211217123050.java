package bousso;

public class ProxyImage implements Image{

    private RealImage rlImage;

    public ProxyImage(RealImage rlImage) {
        this.rlImage = rlImage;
    }

    

    public RealImage getRlImage() {
        return rlImage;
    }

    public void setRlImage(RealImage rlImage) {
        this.rlImage = rlImage;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        rlImage.display();
    }

    
    
}
