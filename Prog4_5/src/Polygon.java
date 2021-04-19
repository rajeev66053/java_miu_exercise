
public interface Polygon {
public int getNumberOfSides();
 	
	//returns the perimeter of the polygon
 	default double computePerimeter(){
 		

		double[] arrayOfSide=this.getArrayOfSides();
		double perimeter=0;;
		
		for(double side : arrayOfSide){
			perimeter+=side;
		}
	
		return perimeter;
	}
	
	//returns in an array all sides of the polygon 
	public double[] getArrayOfSides();
	
	//returns the sum of the values in arr
 	static double sum(double[] arr)
 	{
		double sum = 0;
		for(double value:arr){
			sum+=value;
		}
		return sum;
	}

}
