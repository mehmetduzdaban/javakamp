package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private boolean Verified;

	public User(int id, String firstName, String lastName, String email, String password, boolean verified) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		Verified = verified;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public boolean isVerified() {
		return Verified;
	}

	public void setVerified(boolean verified) {
		Verified = verified;
	}

}
