
public class InheritanceActivity {

	public static void main(String[] args) {
		// Main method which perform --> 1. Instence of manager class by calling the
		// overloaded constructor with passing paramter.
		// invoking the calculateSalary method of the the manager object
		Manager manager = new Manager(126534l, "Peter", "Chennai India", 237844l, 65000);
		manager.calculateSalary();
		System.out.println("*****************************************************");
		Trainee trainee = new Trainee(29846l, "Jack", "Mumbai India", 442085l, 45000);
		trainee.calculateSalary();
		System.out.println("*****************************************************");

		manager.calculateTransportAllowance();
		trainee.calculateTransportAllowance();
		manager.calculateTransportAllowance();
	}

}
