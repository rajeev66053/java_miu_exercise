public final class Rectangle extends ClosedCurve implements Polygon {
	private final double width;
	private final double length;
	
	public Rectangle (double width, double length){
		this.width = width;
		this.length = length;
		
	}
	public double computeArea() {
		return width * length;
	}

	public int getNumberOfSides(){
		return 4;
	}	

	public double[] getArrayOfSides(){
		double[] arr={this.width,this.length,this.width,this.length};

		return arr;
	}
}
