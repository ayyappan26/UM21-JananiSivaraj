package main;

import business.object.BusinessObject;
 /**
 * @author JSivaraj
 * From main method I m calling BO Class view Employee details class. Where
 * 1. it will ask users to pick choice.
 * 2. and according to the choice it will map the method to be executed.
 *
 */
public class MainClass {

	public static void main(String[] args) {
		BusinessObject bo = new BusinessObject();
		bo.viewEmployeeDetails();

	}

}
