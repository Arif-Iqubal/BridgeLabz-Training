package addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;

// AddressBook manages all contacts
class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add new contact with duplicate check
    public void addContact(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.println("Contact already exists!");
        } else {
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    // Edit contact by first name
    public void editContact(String firstName, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
				System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by first name
    public void deleteContact(String firstName) {
        contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName));
        System.out.println("Contact deleted (if existed).");
    }

    // Search by city or state
    public void searchByCityOrState(String place) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(place) ||
                c.getAddress().getState().equalsIgnoreCase(place)) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts in sorted order
    public void displayAll() {
        Collections.sort(contacts);
        System.out.println("All Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
