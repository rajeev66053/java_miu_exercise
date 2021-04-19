package mypackage;

public class Customer {

		private String firstName;
		private String lastName;
		private String socSecurityNum;
		private String billingAddress;
		private String shippingAddress;
		
		public Customer(String fname, String lname, String ssn) {
			firstName=fname;
			lastName=lname;
			socSecurityNum=ssn;		
			
		}
	
		
		/** Provides a string representation of this Employee */
		public String toString() {
			return "[" + firstName + " " + lastName + "]";
		}
		
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		/**
		 * Sets the annual bonus for this Employee. 
		 * This amount is added to yearly salary.
		 * 
		 * @param amount double. The amount of the bonus
		 */
		public void setChristmasBonus(double amount) {
			christmasBonus = amount;
		}
		public Address getHome() {
			return home;
		}
		public void setHome(Address home) {
			this.home = home;
		}
		public Address getWork() {
			return work;
		}
		public void setWork(Address work) {
			this.work = work;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		/**
		 * Computes the total salary of this Employee,
		 * including Christmas bonus.
		 * 
		 * @return Total salary for the year.
		 */
		public double computeTotalSalary() {
			return salary + christmasBonus;
		}

}
