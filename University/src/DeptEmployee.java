import java.time.LocalDate;
import java.util.Date;

public class DeptEmployee {

	private String name;
	private double salary;
	private LocalDate hireDay;
	
		DeptEmployee(String name, double aSalary , int aYear,
				int aMonth, int aDay){
			this.name=name;
			salary = aSalary;
			hireDay = LocalDate.of(aYear,aMonth,aDay);
		}
		
	// instance methods
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name =name ;
		}
		
		// needs to be improved
		public LocalDate getHireDay() {
			return hireDay;
		}
		
		public void setHireDay(int aYear,int aMonth,int aDay) {
			hireDay = LocalDate.of(aYear,aMonth,aDay);
		}
		
		public double computeSalary() {
			return salary;
		}
}
