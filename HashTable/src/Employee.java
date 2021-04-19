
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord=new HashMap<String, Double>();
	
	public void addEntry(String date, double salary) {
		//implement 
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		
		if(salaryRecord.get(date)!=null) {
			double salary = (double)salaryRecord.get(date);
			System.out.println("Jim Jones was paid "+salary+" on "+date);
		}else {
			System.out.println("Jim Jones did not receive a paycheck on "+date);
		}
	}
	public void printAveragePaycheck() {
		//implement
		Set<String> keys = salaryRecord.keySet();
		 
	    //Obtaining iterator over set entries
	    Iterator<String> itr = keys.iterator();
		double totalSalary=0;
		double avgSalary=0;
		int count=0;
	  //now look for the desired Entry	    
	     
	    while(itr.hasNext()) {
	    	String str=itr.next();
	    	totalSalary+=(double) salaryRecord.get(str);
	    	count++;
	    }
	    avgSalary=totalSalary/count;
		System.out.println("Average Salary"+avgSalary);
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
