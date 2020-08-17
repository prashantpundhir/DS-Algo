package array;

public class MaxSubArraySingleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { -1, 2,4,-3,5,2,-5,2 };
		int best=0;
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum=Math.max(ar[i],sum+ar[i]);
			best = Math.max(sum, best);
		}
		System.out.println(best);
	}

}
