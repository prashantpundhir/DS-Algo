package Array;

public class PowerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res= power(2,3);
		System.out.println(res);
		

	}

	public static int power(int val, int n) {
		
		if(n==0)
			return 1;
		
		int temp= power(val,n/2);
		
		if(n%2==0)
			return temp*temp;
		else
			return val * temp*temp;
			
	}
	
}
