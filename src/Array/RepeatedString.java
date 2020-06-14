package Array;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aba";
		long n=10;
		
		System.out.println(findRepeatedString(s,n));

	}
	
	public static long findRepeatedString(String s, long n) {
		long count=0;
		
		long whole = n/(s.length());
		int remaining =(int)n%(s.length());
		
		for(char ch: s.toCharArray())
			if(ch=='a')
				count++;
		
		long total= whole*count;
		
		String ss = s.substring(0, remaining);
		
		for(char ch: ss.toCharArray())
			if(ch=='a')
				total++;
		
		
		
		return total;
		
	}

}
