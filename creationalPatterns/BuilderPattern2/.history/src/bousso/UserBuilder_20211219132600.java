package bousso;

public static class UserBuilder {

    private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

    public UserBuilder(String firstName,String name) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
}
