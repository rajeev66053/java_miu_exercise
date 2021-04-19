
public class Prog7_1 {

	 public static void main(String[] args) {
	        double base = 2; int powerRaised = 10;
	        double result = power(base, powerRaised);

	        System.out.printf("%f^%d = %f", base, powerRaised, result);
	    }

	    public static double power(double x, int n) {
	        if (n != 0)
	            return (x * power(x, n - 1));
	        else
	            return 1;
	    }

}
