
public class MinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
		
	}

	private String sort(String s) {
		// TODO Auto-generated method stub
		if (s.length() < 2) {
	        return s;
	    }

	    int pos = 0;
	    char min = s.charAt(0);
	    for(int i = 1; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c < min) {
	            min = c;
	            pos = i;
	        }
	    }

//	    System.out.printf("%c | %s\n", min, s.substring(0, pos) + s.substring(pos + 1));

	    return min + sort(s.substring(0, pos) + s.substring(pos + 1));
	}
	

}
