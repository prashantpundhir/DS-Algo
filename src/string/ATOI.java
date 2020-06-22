package string;

public class ATOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "6463 43 32hrh";
		String t = "-23dfnd";
		String r = "kdas 8u798s ";

		int sr = atoi(s);

		int tr = atoi(t);

		int rr = atoi(r);
		System.out.println(sr);
		System.out.println(tr);
		System.out.println(rr);

	}

	static int atoi(String s) {
		if(s== null || s.length()==0)
			return 0;
		
		long res = 0;

		int start = 0;
		Boolean negative = false;
		s = s.trim();

		if (s.charAt(0) == '-')
			negative = true;
		
		if (s.charAt(0) == '-' || s.charAt(0) == '+')
			start = 1;

		for (int i = start; i < s.length(); i++) {
				
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				break;
			
			int digit = (int)(s.charAt(i) - '0');
			res = res * 10 + digit;
		}

		if (negative)
			res = -res;

		if(res>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(res<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) res;
	}

}
