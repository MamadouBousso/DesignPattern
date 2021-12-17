package bousso;

public class ProxyImage implements Image{

    private RealImage rlImage;
    private String filename;

    public ProxyImage(String  filename) {
        this.filename = filename;
        rlImage = setRlImage(filename);
    }

    

    public String getFilename() {
        return filename;
    }



    public void setFilename(String filename) {
        this.filename = filename;
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
