package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.validation.constraints.Size;

public class LoginUser {
	@Size(min = 1, max = 20, message = "user name or passowrd can not be empty")
	private String username;
	private String password;

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

	public boolean Select() {
		boolean x = true;
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
			try {
				PreparedStatement stmt = c.prepareStatement("select * from employee where username=? and password=?");
				stmt.setString(1, username);
				stmt.setString(1, password);
				ResultSet rs = stmt.executeQuery();
				while (rs.next())
					x = false;
			} catch (SQLException e) {
				e.printStackTrace();

			}

			finally {
				return x;
			}
		return x;

	}
}