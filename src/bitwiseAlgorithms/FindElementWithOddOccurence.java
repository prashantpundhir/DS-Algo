package bitwiseAlgorithms;

public class FindElementWithOddOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,4,5,6,7,6,7,5,4,5,5,6};
		
		int odd=0;
		
		for(int i: arr)
			odd=odd^i;

		System.out.println(odd);
	}

}
