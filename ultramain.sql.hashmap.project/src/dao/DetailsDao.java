package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;
import dto.Users;

/**
 * @author JSivaraj 
 * In Data Access Object class we are interacting with SQL to bring data.
 *
 */
public class DetailsDao {
	
//created a hash map
	HashMap<Integer, Users> hash_map = new HashMap<Integer, Users>();

	public void viewAllDetails() throws SQLException {
		HashMap();
		for (Integer i : hash_map.keySet()) {
			Users us = hash_map.get(i);
			System.out.println("user ID: " + us.getId() + "|First name:   " + us.getFname() + "|Last Name:   "
					+ us.getLname() + "|Email Id:   " + us.getMail());

		}

	}

	public void getparticualarDetail(int choiceofuser) throws SQLException {
		HashMap();
		Users us = hash_map.get(choiceofuser);
		System.out.println("user ID: " + us.getId() + "|First name:   " + us.getFname() + "|Last Name:   "
				+ us.getLname() + "|Email Id:   " + us.getMail());

	}

	public void HashMap() throws SQLException {
		Connection con = DBConnection.getDbConnection();
		String query = "SELECT * FROM employees";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {
			
			Integer id = rs.getInt("EMPLOYEE_ID");
			String fname = rs.getString("FIRST_NAME");
			String lname = rs.getString("LAST_NAME");
			String mail = rs.getString("EMAIL");

			Users u = new Users(id, fname, lname, mail);
			hash_map.put(id, u);
		}

	}

}
