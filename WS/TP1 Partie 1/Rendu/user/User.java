

import java.io.Serializable;

public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	public User() {
		super();
	}
	
	public User(String email, String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	// prenom
	private String firstName;
	
	// nom
	private String lastName;
	
	// email
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

