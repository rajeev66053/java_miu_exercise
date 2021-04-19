import java.util.Arrays;

public class MyStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArr= {"big", "small", "tall", "short", "round", "square",
		                       "enormous", "tiny","gargantuan", "lilliputian",
		                       "numberless", "none", "vast", "miniscule"};
		
		int arrLength = stringArr.length;

		String[] sortedArray=minSort(stringArr,arrLength);
		
		System.out.println("Sorted Array:"+Arrays.toString(sortedArray));	
		
	}
	
	private static String[] minSort(String[] stringArr, int n) {
		// TODO Auto-generated method stub
		
		String temp;
		for(int a=0;a<n;a++) {
		    for(int b=a+1;b<n;b++) {
		        if( stringArr[a].compareTo(stringArr[b]) > 0 ) {
		            temp = stringArr[a];
		            stringArr[a] = stringArr[b];
		            stringArr[b] = temp;
		        }
		    }
		}
		
		return stringArr;
		
	}
}
