package business.object;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import dao.EmpDetailsDao;
import dto.EmpDto;
import scan.Scan;

/**
 * @author JSivaraj In BO class we give a overview of the methods. Like which
 *         needs to be executed. Which class needs to be executed according to
 *         the user interaction 1. it will ask users to pick choice. 2. and
 *         according to the choice it will map the method to be executed.
 *
 */
public class BusinessObject {
	EmpDetailsDao empDao = new EmpDetailsDao();

	public void viewEmployeeDetails() {
		HashMap<Integer, EmpDto> empMap = null;
		Scanner scan = Scan.getScannerInstance();
		int choice = 0;
		do {
			System.out.println("***Enter the choice***");
			System.out.println("1.view all the employee details");
			System.out.println("2.view particular employee details");
			System.out.println("3.view Employees by department");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			this.viewAllEmployees();
			break;
		case 2:
			viewParticularEmployee();
			break;
		case 3:
			viewEmployeesByDepartment();
		default:
			System.out.println("enter 1 or 2 or 3");
		}
	}

	/*
	 * viewAllEmployee method will map the method from DAO class method which views
	 * all the table.
	 */
	public void viewAllEmployees() {
		try {

			HashMap<Integer, EmpDto> empMap = empDao.viewAllDetails();// new Haash
			printEmpDetials(empMap);
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}
	/*
	 * viewParticularEmployee method will map the method from DAO class method which
	 * views only the given ID values
	 */

	public void viewParticularEmployee() {
		Scanner scan = Scan.getScannerInstance();
//		int id;
//		System.out.println("Enter Employee ID to view details:");
//		id = scan.nextInt();
//		try {
//			//dao.getparticualarDetail(id);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

	}

	public void printEmpDetials(HashMap<Integer, EmpDto> empMap) {
		Set<Integer> empIds = empMap.keySet();
		for (Integer empId : empIds) {
			EmpDto dto = empMap.get(empId);
			System.out.println("Employee Id : " + dto.getFname());
			System.out.println("First Name : " + dto.getFname());
			System.out.println("**************************************************");
		}
	}

	public void printEmpDetailsByDepartmet(ArrayList<EmpDto> employeelist) {
		EmpDto empdto = new EmpDto(0, null, null, null, null);
		for (int i = 0; i < employeelist.size(); i++) {
			empdto = employeelist.get(i);
			System.out.println("Employee Id : " + empdto.getFname());
			System.out.println("First Name : " + empdto.getId());
			System.out.println("Last Name : " + empdto.getMail());
			System.out.println("Department: " + empdto.getDepartment());
			System.out.println("**************************************************");

		}
	}

	private void viewEmployeesByDepartment() {
		try {

			ArrayList<EmpDto> employeelist = empDao.viewEmployeeByDepartmentDoa();
			printEmpDetailsByDepartmet(employeelist);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
