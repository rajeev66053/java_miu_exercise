import java.util.Random;

public class SumRandomNumber {

	public static void main(String[] args) {
		
		Random random=new Random();

		for(int i=0;i<=7;i++) {
			int firstNumber = random.nextInt(100);
			int secondNumber = random.nextInt(100);
			int sum=firstNumber+secondNumber;			

			String output = "";
			
			output = String.format("%16d%n",firstNumber);
			output += String.format("%13s %2d%n","+", secondNumber);
			output += String.format("%16s%n","____");
			output += String.format("%16d%n%n",sum);
			System.out.println(output);
	
		}

	}

}
