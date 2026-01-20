package addressbooksystem;

public class AddressBookApp {

	public static void main(String[] args) {

		AddressBook book = new AddressBook();

		// Creating contacts
		Contact c1 = new Contact("Arif", "Iqubal", "9876543210", "arif@gmail.com",
				new Address("Ahmedabad", "Gujarat", "380001"));

		Contact c2 = new Contact("Ravi", "Sharma", "9123456780", "ravi@gmail.com",
				new Address("Jaipur", "Rajasthan", "302001"));

		// Adding contacts
		book.addContact(c1);
		book.addContact(c2);

		// Editing contact
		book.editContact("Arif", "9999999999", "arif@digicontact.com");

		// Searching by city
		book.searchByCityOrState("Gujarat");

		// Display sorted contacts
		book.displayAll();

		// Deleting a contact
		book.deleteContact("Ravi");

		// Display after deletion
		book.displayAll();
	}
}
