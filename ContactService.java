//Shawn Millin
//SNHU CS-320
//Module Three

package quality_project;


import java.util.ArrayList;
import quality_project.Contact;

public class ContactService {

	public ArrayList<Contact> contacts = new ArrayList<Contact>();


	public void addContact(String contactId, String firstName, String lastName, String phoneNum, String address) {
		
		Contact contact = new Contact(contactId, firstName, lastName, phoneNum, address);
		contacts.add(contact);

	}

	public Contact getContact(String contactId) {
		Contact contact = new Contact(null,null, null, null, null);
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().contentEquals(contactId)) {
				contact = contacts.get(i);
			}
		}
		return contact;
	}

	public void deleteContact(String contactId) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().equals(contactId)) {
				contacts.remove(i);
				break;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact Id not found.");
			}
		}
	}


	public void updateFirstName(String updatedString, String contactId) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().equals(contactId)) {
				contacts.get(i).setFirstName(updatedString);
				break;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact Id not found.");
			}
		}
	}

	
	public void updateLastName(String updatedString, String contactId) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().equals(contactId)) {
				contacts.get(i).setLastName(updatedString);
				break;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact Id not found.");
			}
		}
	}

	
	public void updateNumber(String updatedString, String contactId) {
		for (int counter = 0; counter < contacts.size(); counter++) {
			if (contacts.get(counter).getContactId().equals(contactId)) {
				contacts.get(counter).setPhoneNumber(updatedString);
				break;
			}
			if (counter == contacts.size() - 1) {
				System.out.println("Contact Id  not found.");
			}
		}
	}

	
	public void updateAddress(String updatedString, String contactId) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactId().equals(contactId)) {
				contacts.get(i).setAddress(updatedString);
				break;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact Id not found.");
			}
		}
	}
}