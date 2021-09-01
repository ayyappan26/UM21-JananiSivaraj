interface LibraryUser {
	void registerAccount(int age);

	void requestBook(String bookType);

}

public class AdultUser implements LibraryUser {

	int age;
	String bookType;

	public void registerAccount(int age) {
		this.age = age;
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");

	}

	public void requestBook(String bookType) {
		this.bookType = bookType;
		if (bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else
			System.out.println("Oops, you are allowed to take only adult fiction books");

	}
}
