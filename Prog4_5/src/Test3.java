public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = {
						new Triangle(4,5,6),
						new Square(3),
						new Rectangle(3,4)
					};
		//compute areas
		for(Polygon pp : objects) {
			String nameOfCurve = pp.getClass().getSimpleName();

			System.out.println("For this " + nameOfCurve +"\n Perimeter =" + pp.computePerimeter());
			
		}
    
	}

}