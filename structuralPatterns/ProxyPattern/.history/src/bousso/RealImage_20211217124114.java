package bousso;

public class RealImage implements Image {
    
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Display realimage");
        loadFromDisk();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private void loadFromDisk(){
        System.out.println("Load from disk the file "+this.filename);
    }


    
}
