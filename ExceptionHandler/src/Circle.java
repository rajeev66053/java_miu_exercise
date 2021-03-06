
public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException {
		this(radius.doubleValue());
	}
	public Circle(double radius){
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
