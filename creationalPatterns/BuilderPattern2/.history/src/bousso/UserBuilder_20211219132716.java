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

    
}
