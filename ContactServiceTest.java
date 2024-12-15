//Shawn Millin
//SNHU CS-320
//Module Three

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



import java.util.ArrayList;


import quality_project.Contact;
import quality_project.ContactService;



public class ContactServiceTest {

	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("6857096543","Sam", "Miller", "1234567890", "456 Abby lane");
		service.updateFirstName("Sven", "9");
		assertEquals("Sven", service.getContact("9").getFirstName(), "First name was not updated.");
	}

	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("6857096543","Sam", "Miller", "1234567890", "456 Abby lane");
		service.updateLastName("Shirley", "11");
		assertEquals("Shirley", service.getContact("11").getLastName(), "Last name was not updated.");
	}

	@Test
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("6857096543","Sam", "Miller", "1234567890", "456 Abby lane");
		service.updateNumber("5555550000", "17");
		assertEquals("5555550000", service.getContact("17").getPhoneNumber(), "Phone number was not updated.");
	}

	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("6857096543","Sam", "Miller", "1234567890", "456 Abby lane");
		service.updateAddress("555 Nowhere Ave", "15");
		assertEquals("555 Nowhere Ave", service.getContact("15").getAddress(), "Address was not updated.");
	}

	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("6807914532","Sam", "Miller", "1234567890", "456 Abby lane");
		service.deleteContact("17");
		// Ensure that the contactList is now empty by creating a new empty contactList to compare it with
		ArrayList<Contact> contactsEmpty = new ArrayList<Contact>();
		assertEquals(service.contacts, contactsEmpty, "The contact was not deleted.");
	}

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("6769013452","Sam", "Miller", "1234567890", "456 Abby lane");
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
	}

}
