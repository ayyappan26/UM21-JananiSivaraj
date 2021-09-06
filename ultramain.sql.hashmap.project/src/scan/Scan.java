package scan;

import java.util.Scanner;

/**
 * @author JSivaraj
 * created Scanner method to use where ever its needed in project
 *
 */



public class Scan {
	public static Scanner getScannerInstance() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}



