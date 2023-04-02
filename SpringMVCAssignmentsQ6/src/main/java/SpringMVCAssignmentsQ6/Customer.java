package SpringMVCAssignmentsQ6;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message = "UserName should not be empty")
	@Size(min = 8, max = 30, message = "Username must have atleast 8 characters and atmost 20 characters")
	@Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Only Alphabets and Numbers allowed ,space not allowed.")
	private String username;
	@Size(min = 8, message = "Passowrd must have atleast 8 characters")
	
	private String password;
	@Size(min = 8, message = "Email should not be empty")
	@Size(min = 1, message = "Email should not be empty")
	private String email;
	@Contact
	@Size(min = 10, max = 10)
	private String contact;
	@Size(min = 1, message = "City should not be empty")
	private String city;
	
	@Size(min = 5, max = 10, message = "Pin must be of six digit")
	@CityCode
	private String pin;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
