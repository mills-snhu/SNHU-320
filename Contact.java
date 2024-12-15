//Shawn Millin
//SNHU CS-320
//Module Three

package quality_project;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String contactId, String firstName, 
			String lastName, String phoneNum, String address){
		
		if(contactId == null || contactId.length()>10 ){
			throw new IllegalArgumentException("Unacceptable Contact ID");
			
		}
		if(firstName == null || firstName.length()>10 ) {
			throw new IllegalArgumentException("Unacceptable First Name");
		}
		if(lastName == null || lastName.length()>10 ) {
			throw new IllegalArgumentException("Unacceptable Last Name");	
		}
		if(phoneNum == null || phoneNum.length()!=10 ) {
			throw new IllegalArgumentException("Unacceptable Phone Number");
		}
		if(address == null || address.length()>30 ) {
			throw new IllegalArgumentException("Unacceptable Address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	//Getters for each variable
	public String getContactId(){
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
    public String getLastName() {
    	return lastName;
    }
    public String getPhoneNumber(){
    	return phoneNum;
    }
    public String getAddress() {
    	return address;
    }
    
	public String setFirstName(String firstName) {
		return this.firstName;
	}
    public String setLastName(String lastName) {
    	return this.lastName;
    }
    public String setPhoneNumber(String phoneNum){
    	return this.phoneNum;
    }
    public String setAddress(String address) {
    	return this.address;
    }
}
