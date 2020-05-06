package Array;

public class LeadersInArray {

	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		int arr[] = { 8, 15, 3, 9, 7, 2 };
		int n = arr.length;
		lead.printLeaders(arr, n);

	}

	public void printLeaders(int arr[], int n) {
		int rightMax = arr[n - 1];
		System.out.print(rightMax + " ");
		for (int i = n - 2; i >= 0; i--) {
			if (rightMax < arr[i]) {
				rightMax = arr[i];
				System.out.print(rightMax + " ");
			}
		}

	}

}
