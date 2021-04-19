public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	public int getNumberOfSides(){
		return 4;
	}

	public double[] getArrayOfSides(){
		double[] arr={this.side,this.side,this.side,this.side};

		return arr;
	}
}
