package Prog9_1;

public class MyStringStack {
	
	private Node top;
	
	public String pop() {
		//implement
		if(top !=null) {
			String s=peek();
			top=top.next;
			return s;
		}
		return null;
	}
	public String peek() {
		//implement
		if(top !=null) {
			return top.value;
		}
		
		return null;
	}
	
	public void push(String s) {
		//implement
		Node newTop=new Node();
		newTop.value=s;
		newTop.next=top;
		top=newTop;
	}
	
	class Node  {
		String value;
		Node next;
		
		@Override
		public String toString() {
		    if(value == null) return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
	}
	
	public static void main(String[]args){
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
	}
}
