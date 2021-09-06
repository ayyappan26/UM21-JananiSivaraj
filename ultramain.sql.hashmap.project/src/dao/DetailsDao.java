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

public class DetailsDao {
	// public Map<Integer,Users> HashMap() throws SQLException{

	HashMap<Integer, Users> hash_map = new HashMap<Integer, Users>();

	public void viewAllDetails() throws SQLException {

		Connection con = DBConnection.getDbConnection();
		HashMap();
		for (Integer i : hash_map.keySet()) {
			Users us = hash_map.get(i);
			System.out.println("user ID: " + us.getId() + "|First name:   " + us.getFname() + "|Last Name:   "
					+ us.getLname() + "|Email Id:   " + us.getMail());

		}

	}

	public void getparticualarDetail(int choiceofuser) throws SQLException {
		Connection con = DBConnection.getDbConnection();
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
		// Users u;
		while (rs.next()) {
			// hash_map.put(rs.getInt(1), rs.getString(2));
			Integer id = rs.getInt("EMPLOYEE_ID");
			String fname = rs.getString("FIRST_NAME");
			String lname = rs.getString("LAST_NAME");
			String mail = rs.getString("EMAIL");

			Users u = new Users(id, fname, lname, mail);
			hash_map.put(id, u);
		}

	}

}
