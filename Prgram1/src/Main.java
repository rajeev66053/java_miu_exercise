import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Address billingAdd1 = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address billingAdd2 = new Address("street 2","Chicago", "Illinois", "60605");
		Address shippingAdd1 = new Address("street 1","Chicago", "Illinois", "60601");
		Address shippingAdd2 = new Address("110 Burlington", "Fairfield", "IA", "52556");
		
		Customer c1 = new Customer("Joe", "Smith","ssn: 332-221-4444");
		c1.setBillingAddress(billingAdd1);
		c1.setShippingAddress(shippingAdd1);
		
		Customer c2 = new Customer("Steve", "Coleman","ssn: 331-251-4884");
		c2.setBillingAddress(billingAdd2);
		c2.setShippingAddress(shippingAdd2);
		
		
		//Creates an Employee array of length 2
		Customer[] custArray = new Customer[2];
		custArray[0] = c1;
		custArray[1] = c2;
		

		
		/*
		 * Searches the array for an Employee having first name "Bill".
		 * If found, prints out the Employee's full name
		 */
		for(int i = 0; i < custArray.length; ++i) {
			var billingAddress = custArray[i].getBillingAddress();
			if(billingAddress.getCity().equals("Chicago")) {
				System.out.println("Found the Customer! " + custArray[i].toString());
			}
		}
		
	}

}
