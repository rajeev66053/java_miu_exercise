import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor p1=new Professor("Steve",1000.00,1991,5,6,10);
		Professor p2=new Professor("John",1200.00,1995,2,12,10);
		Professor p3=new Professor("Ryan",1500.00,1993,9,15,10);
		Secretary s1=new Secretary("Jack",1200.00,1998,5,6,200.00);
		Secretary s2=new Secretary("Robin",1250.00,1999,4,3,200.00);
		
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0]=p1;
		department[1]=p2;
		department[2]=p3;
		department[3]=s1;
		department[4]=s2;
		
		
		System.out.println("Do you want to see the the sum of all salaries in the department?  (y/n)");
		Scanner sc= new Scanner(System.in);
		String answer = sc.next();
		sc.close();
		if(answer.equalsIgnoreCase("y")){
			
			double salary=0;
			
			for(DeptEmployee d : department ) {
				salary+=d.computeSalary();
			}
			
			System.out.println("The sum total salary of professor and secretary is:"+salary);
		}
		else {
			//do nothing..the application ends here
		}
		
		
		
				
	}

}
