package employee.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ultramain.util.Scan;

import db.connection.ConnectionDB;
/**
 * @author JSivaraj
 * This class is responsible to get data from a  database.
 * to achieve the above statement it need to have connection with DB.
 */
public class EmpDao {

	public void viewEmployees() throws SQLException {
		Scanner scan = Scan.getScannerInstance();
		Connection con = ConnectionDB.getDbConnection();
		String WhichEmployee;
		System.out.println("enter the first name of employee: ");
		WhichEmployee = scan.nextLine();
		String sqlQuery = "select *from employees where first_name='" + WhichEmployee + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		int employeeID;
		String employeeFirstName;
		String employeeLastName;
		String employeeEmail;

		while (rs.next())// rs.next() this will return true if the table has rows. if not it will return
							// false.
		{
			employeeID = rs.getInt(1); // 1 is column index. we can index or column name from SQL as Employee_ID
			employeeFirstName = rs.getString(2);
			employeeLastName = rs.getString(3);
			employeeEmail = rs.getString(4);

			System.out.println("employeeID : " + employeeID);
			System.out.println("employeeFirstName : " + employeeFirstName);
			System.out.println("employeeLastName : " + employeeLastName);
			System.out.println("employeeEmail : " + employeeEmail);
			// System.out.println("employeePhone : "+ employeePhone);

			System.out.println("*************************************************");
		}

	}

}
