package Array;

import java.util.Scanner;

public class SQRTusingBinarySearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to find its sqrt: ");
		int num = scan.nextInt();

		System.out.println("Squareroot of " + num + " is: " + findSqrt(num));

	}

	public static int findSqrt(int n) {

		int i = 0, j = n - 1, mid=0;
		if(n==1)
			return 1;
			
		
		while (i <= j) {
			mid= (i+j)/2;
			if (mid * mid == n)
				return mid;
			else if (mid * mid < n && ((mid + 1) * (mid + 1) > n))
				return mid;
			if(mid*mid < n)
				i= mid+1;
			else
				j=mid-1;
			
		}

		return mid;
	}

}
