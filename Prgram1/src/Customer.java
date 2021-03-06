public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String fname, String lname, String ssn) {
		firstName=fname;
		lastName=lname;
		socSecurityNum=ssn;	
		
	}
	
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + " " + lastName + " "+ socSecurityNum+"]";
	}
	
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getSocSecurityNum() {
		return socSecurityNum;
	}

}
