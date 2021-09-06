package business.object;

import java.sql.SQLException;
import java.util.Scanner;

import dao.DetailsDao;
import scan.Scan;

public class BusinessObject {
	DetailsDao dao = new DetailsDao();

	public void viewEmployeeDetails() {
		Scanner scan = Scan.getScannerInstance();
		int choice = 0;
		do {
			System.out.println("***Enter the choice***");
			System.out.println("1.view all the employee details");
			System.out.println("2.view particular employee details");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			viewAllEmployees();
			break;
		case 2:
			viewParticularEmployee();
			break;
		default:
			System.out.println("enter 1 or 2");
		}
	}

	public void viewAllEmployees() {
		try {
			dao.viewAllDetails();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	public void viewParticularEmployee() {
		Scanner scan = Scan.getScannerInstance();
		int id;
		System.out.println("Enter Employee ID to view details:");
		id = scan.nextInt();
		try {
			dao.getparticualarDetail(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
