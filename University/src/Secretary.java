
public class Secretary extends DeptEmployee {


	private double overtimeHours; 

	Secretary(String name, double aSalary, int aYear, int aMonth, int aDay, double oth) {
		super(name, aSalary, aYear, aMonth, aDay);
		// TODO Auto-generated constructor stub
		this.overtimeHours=oth;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	public void setOvertimeHours(double oth) {
		this.overtimeHours =oth ;
	}
	
	@Override
	public double computeSalary() {		
		double Salary=super.computeSalary();		
		
		return Salary+12*overtimeHours;
	}
	
	
	
}
