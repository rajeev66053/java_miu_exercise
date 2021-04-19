public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement
		Middle middle=new Middle();
		Middle.Bottom middlebottom = middle.new Bottom();
		int bottomVal=middlebottom.b;
		return bottomVal;
	}
	class Middle{
		int m = 2;
		//returns sum of instance vble in Top and 
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement
			Top top =new Top();
			int topVal=top.t;
			
			Bottom bottom=new Bottom();
			int bottomVal=bottom.b;
						
			return topVal + bottomVal;
		}
		class Bottom{
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				
				Top top =new Top();
				int topVal=top.t;
				
				Middle middle=new Middle();
				int middleVal=middle.m;
				
//				Bottom bottom=new Bottom();
//				int bottomVal=b;
				return topVal *middleVal * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		
		top.mid=top.new Middle(); 
		
		top.midbot=top.mid.new Bottom();
				
		System.out.println(top.mid.addTopAndBottom());
		
		System.out.println(top.midbot.multiplyAllThree());

	}

}