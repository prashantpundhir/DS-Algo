package string;

public class SmallestAndLargestSubstring {

	public static void main(String[] args) {
		
		String s = "welcometojava";
		int k =3;
		// substrings : wel elc lco com ome met eto toj oja jav ava	
		
		System.out.println(getSmallestAndLargetSubstring(s,k));
	
	}
	
	public static String getSmallestAndLargetSubstring(String s,int k) {
		
		String substring = s.substring(0,k);
		String smallest =  substring;
		String largest =  substring;

		for(int i =1; i<= s.length()-k;i++) {
			substring = s.substring(i,i+k);
			if(substring.compareTo(smallest) < 0)
				smallest= substring;
			if(substring.compareTo(largest)>0)
				largest = substring;
		}
		
		return smallest + "\n" + largest;
	}

}
