package addressbooksystem;

import java.util.Objects;

//Contact class stores personal contact details
class Contact implements Comparable<Contact> {

	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Address address; // Composition

	// Constructor
	public Contact(String firstName, String lastName, String phone, String email, Address address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	// Getters & Setters (Encapsulation)
	public String getFirstName() {
		return firstName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	// Used to check duplicate contacts
	@Override
	public boolean equals(Object o) {
		Contact c = (Contact) o;
		return firstName.equalsIgnoreCase(c.firstName) && lastName.equalsIgnoreCase(c.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	// Sorting by first name
	@Override
	public int compareTo(Contact c) {
		return this.firstName.compareToIgnoreCase(c.firstName);
	}

	// Display contact
	@Override
	public String toString() {
		return firstName + " " + lastName + " | Phone: " + phone + " | Email: " + email + " | Address: " + address;
	}
}
