
public class Prog2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value= {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		int minValue=min(value);
		
		System.out.println("Min value:"+minValue);
		

	}
	
	static int min(int[] arrayOfInts) {
		
		int minValue = arrayOfInts[0]; 
	    for(int i=1;i<arrayOfInts.length;i++){ 
	      if(arrayOfInts[i] < minValue){ 
	        minValue = arrayOfInts[i]; 
	      } 
	    } 
	    return minValue; 
		
	}

}
