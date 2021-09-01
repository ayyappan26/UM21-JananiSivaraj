
class Employee {

	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public final double specialAllowance = 250.80;
	public final double Hra = 1000.50;

	Employee() {

	}

	Employee(long id, String Name, String address, long phone) {
		id = employeeId;
		Name = employeeName;
		address = employeeAddress;
		phone = employeePhone;

	}

	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		System.out.println("Calculated salary of Employee = " + salary);

	}

	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = basicSalary / 100;
		System.out.println("Tansport Allowance of Trainee = " + transportAllowance);

	}
}

class Manager extends Employee {

	Manager() {

	}

	Manager(long id, String Name, String address, long phone, double salary) {
		employeeId = id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;

		System.out.println("Manager ID = " + employeeId);
		System.out.println("Manager Name = " + employeeName);
		System.out.println("Manager address = " + employeeAddress);
		System.out.println("Manager phone = " + employeePhone);
		System.out.println("Manager salary = " + basicSalary);
	}

	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 15 * basicSalary / 100;
		System.out.println("Tansport Allowance of Manager= " + transportAllowance);

	}

}

class Trainee extends Employee {

	Trainee() {

	}

	Trainee(long id, String Name, String address, long phone, double salary) {
		employeeId = id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;

		System.out.println("Trainee ID = " + employeeId);
		System.out.println("Trainee Name = " + employeeName);
		System.out.println("Trainee address = " + employeeAddress);
		System.out.println("Trainee phone = " + employeePhone);
		System.out.println("Trainee salary = " + basicSalary);
	}
}
