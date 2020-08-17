package string;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "abc";
		String t = "abc";
		String u = new String("abc").intern();
		
		System.out.println(u.equals(s));
		
		
		

	}

}
