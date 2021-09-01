
public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUser kid = new KidUser();
		kid.registerAccount(10);
		kid.registerAccount(18);
		kid.requestBook("Kids");
		kid.requestBook("Fiction");
		System.out.println("********************************************************");
		AdultUser Adult = new AdultUser();
		Adult.registerAccount(5);
		Adult.registerAccount(23);
		Adult.requestBook("Kids");
		Adult.requestBook("Fiction");

	}

}
