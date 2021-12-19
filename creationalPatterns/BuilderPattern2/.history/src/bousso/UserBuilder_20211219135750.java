package bousso;

public static class UserBuilder {

    private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

    public UserBuilder(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder age(int age){
        this.age = age;
        return this;
    }

    public UserBuilder phone(String phone){
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address){
        this.address = address;
        return this;
    }

    public User build(){
        User us = new User(this);
        validateUser(us);
        return us;
    }

    private void validateUser(User us) {
    }

    
}
