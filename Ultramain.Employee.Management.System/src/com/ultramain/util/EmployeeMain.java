package com.ultramain.util;

import business.EmployeeBo;

/**
 * @author JSivaraj
 *In main method it calls the Business Object class where it defines the functionality, employees.
 */
public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeBo emp=new EmployeeBo();
		emp.employeeSystem();

	}

}
