
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=RandomNumbers.getRandomInt(1,9);
		double m=Math.pow(Math.PI, x);
		System.out.println("Value of Pi^x is"+m);

		int y=RandomNumbers.getRandomInt(3,14);
		double a=Math.pow(y,Math.PI);
		System.out.println("Value of y^Pi is:"+a);
		
	}

}
