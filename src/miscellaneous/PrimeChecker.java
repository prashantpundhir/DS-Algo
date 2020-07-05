package miscellaneous;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		int m = 19;
		
		checkPrime(n);
		checkPrime(m);
	}
	
	static void checkPrime(int n) {
		
			System.out.println("Is " + n + " Prime: " + isPrime(n));
		
	}
	
	static Boolean isPrime(int n) {
		if(n%2==0)
			return false;
		
		int sqrt = (int)Math.sqrt(n);
		
		for(int i =3; i<=sqrt;i++)
			if(n%i==0)
				return false;
		
		return true;
	}

}
