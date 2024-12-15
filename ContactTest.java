//Shawn Millin
//SNHU CS-320
//Module Three
		
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import quality_project.Contact;

class ContactTest{

	@Test
	void testContact() {
		Contact contact= new Contact("67543","Sam", "Miller", "7152354867", "123 hover street");
		assertTrue(contact.getContactId().equals("67543"));
		assertTrue(contact.getFirstName().equals("Sam"));
		assertTrue(contact.getLastName().equals("Miller"));
		assertTrue(contact.getPhoneNumber().equals("7152354867"));
		assertTrue(contact.getAddress().equals("123 hover street"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("675437854456","Sam", "Miller", "7152354867", "123 hover street");
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sammual Junior", "Miller", "7152354867", "123 hover street");
		});
	}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", "Miller-McArthur Senior", "7152354867", "123 hover street");
		});
	}
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", "Miller", "2354867", "123 hover street");
		});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", "Miller", "7152354867", "123 hover street menomonie wisconsin");
		});	
	}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", "Miller", "7152354867", null);
		});	
	}
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", "Miller", null, "123 hover street menomonie wisconsin");
		});	
	}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543","Sam", null, "7152354867", "123 hover street menomonie wisconsin");
		});	
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("67543",null, "Miller", "7152354867", "123 hover street menomonie wisconsin");
		});	
	}
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact(null,"Sam", "Miller", "7152354867", "123 hover street menomonie wisconsin");
		});	
	}

}
