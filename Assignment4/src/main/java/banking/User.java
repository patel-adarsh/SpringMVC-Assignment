package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.validation.constraints.Size;

public class User {
	@Size(min = 5, max = 50, message = "User Name can not be empty")
	private String username;
	@Size(min = 5, max = 50, message = "Password can not be empty")
	private String password;
	@Size(min = 5, max = 50, message = "Email can not be empty")
	private String email;

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

	public void Insert() {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Adarsh@83");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (c != null)
			System.out.println("Connected....");
		try {
			PreparedStatement stmt = c.prepareStatement("insert into employee values(?,?,?)");
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, email);
			int i = stmt.executeUpdate();
			System.out.println("succesfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}