package business;

import java.sql.SQLException;
import java.util.Scanner;

import com.ultramain.util.Scan;

import employee.dao.EmpDao;

public class EmployeeBo {
	EmpDao dao = new EmpDao();

	public void employeeSystem() {
		Scanner scan = Scan.getScannerInstance();
		int choice = 0;
		do {
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			viewEmployee(dao);
			break;
		case 2:
			registerEmployee();
			break;
		case 3:
			break;
		}
	}

	public void registerEmployee() {

	}

	public void viewEmployee(EmpDao dao) {
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
