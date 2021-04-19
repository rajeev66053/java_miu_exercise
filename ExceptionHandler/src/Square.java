public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}