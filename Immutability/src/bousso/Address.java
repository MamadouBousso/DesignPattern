package bousso;

public class Address {

    public String city;
    public String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String toString(){
        return this.city+" "+this.state;
    }
    
    
}
