package string;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am Prashant Pundhir";
		
		printReverse(s);
		
	}

	static void printReverse(String s) {
		String []str = s.split(" ");
		
		for(int i= str.length-1;i>=0;i--)
			System.out.print(str[i]+" ");
		
		
		
	}
}
