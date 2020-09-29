package miscellaneous;

public class maxSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="This is Prashant. I want to work in big tech company. I am preparing for that.";
		
		System.out.println(printMaxSentence(s));

	}

	static String printMaxSentence(String s) {
		
		if(s==null)
			return s;
		String []strToken = s.split("\\.");
		int statement =0;
		int currLength=0;

		
		for(int i=0;i<strToken.length;i++) {
		
			String[] subToken = strToken[i].split(" ");

			if(currLength < subToken.length) {

				currLength = subToken.length;
			
				
				statement = i;
			}
			
		}
		
		return strToken[statement].trim();
		
	}
}
