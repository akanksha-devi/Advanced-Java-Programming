package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";  
	     String host = "jdbc:mysql://localhost:3306/employeedb";
	     String username = "root";
	     String pwd = "Nig@101317";
	     
	     String query = "select * from employee where salary >= ?";
	     long inSalary = 40000;
	     
	     
	     try {
	    	 Class.forName(driver_name);  //loads mySQL into the memory
	    	 Connection con = DriverManager.getConnection(host,username,pwd);
	    	 PreparedStatement pst = con.prepareStatement(query);
	    	 pst.setLong(1, inSalary);
	    	 ResultSet rs = pst.executeQuery();
	    	 System.out.println("ID\\tName\\tDepartment\\tSalary");
	    	 
	    	 while(rs.next()) {
		    	   int id = rs.getInt("id");
		    	   String name = rs.getString("name");
		    	   String dept = rs.getString("dept");
		    	   long salary = rs.getLong("salary");
		    	   
		    	   System.out.println(String.format("%d\t%s\t%s\t\t%d", id, name, dept, salary));
		       }
		       
	     } catch(ClassNotFoundException | SQLException e) {
	    	 e.printStackTrace();
	     }
	}

}
