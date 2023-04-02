package employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class managementmodel {
	private String name;
	private String dept;
	private String designation;
	private String salary;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
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
			PreparedStatement stmt = c.prepareStatement("insert into emps values(?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, dept);
			stmt.setString(4, designation);
			stmt.setString(5, salary);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void Update() {
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
			PreparedStatement stmt = c
					.prepareStatement("UPDATE emps Set employee_name=?,employee_dept=?,employee_desi=?,"
							+ "employee_salary=? WHERE employee_id=?");
			stmt.setString(1, name);
			stmt.setString(2, dept);
			stmt.setString(3, designation);
			stmt.setString(4, salary);
			stmt.setInt(5, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void Delete(int n) {
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
			PreparedStatement stmt = c.prepareStatement("DELETE FROM emps WHERE employee_id=?");
			stmt.setInt(1, n);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		System.out.println("good");
	}
}
