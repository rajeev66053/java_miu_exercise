
public class Professor extends DeptEmployee {


	private int numberOfPublications;
	
	Professor(String name, double aSalary, int aYear, int aMonth, int aDay,int nop) {
		super(name, aSalary, aYear, aMonth, aDay);
		// TODO Auto-generated constructor stub
		this.numberOfPublications=nop;
	}

	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublications(int nop) {
		this.numberOfPublications =nop ;
	}
}
