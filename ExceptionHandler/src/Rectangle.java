public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	
	public Rectangle(Double width, Double length) throws IllegalClosedCurveException {
		this(length.doubleValue(),width.doubleValue());
	}
	
	
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
