
public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = Data.records;
		
		String[] rows=myString.split(":");
		
		for (String row : rows) {
	        String[] columns = row.split(",");
	        
	        System.out.printf("%s%n",columns[0]);
	    }

	}

}
