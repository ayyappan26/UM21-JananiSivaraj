package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;
import dto.EmpDto;

/**
 * @author JSivaraj 
 * In Data Access Object class we are interacting with SQL to bring data.
 *
 */
public class EmpDetailsDao {
	
//created a hash map
	HashMap<Integer, EmpDto> empMap = new HashMap<Integer, EmpDto>();

	public HashMap<Integer, EmpDto> viewAllDetails() throws SQLException {
		getAllEmployees();
		/*
		for (Integer i : empMap.keySet()) {
			EmpDto us = empMap.get(i);
			System.out.println("user ID: " + us.getId() + "|First name:   " + us.getFname() + "|Last Name:   "
					+ us.getLname() + "|Email Id:   " + us.getMail());

		}
		*/
		return empMap;

	}

	public void getparticualarDetail(int empId) throws SQLException {
		

	}

	private void getAllEmployees() throws SQLException {
		Connection con = DBConnection.getDbConnection();
		String query = "SELECT * FROM employees";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {
			
			
			Integer id = rs.getInt("EMPLOYEE_ID");
			String fname = rs.getString("FIRST_NAME");
			String lname = rs.getString("LAST_NAME");
			String mail = rs.getString("EMAIL");

			EmpDto empDto = new EmpDto(id, fname, lname, mail);
			empMap.put(id, empDto);
		}

	}

}
