package sorting;

public class MergeSorting {

	public static void main(String[] args) {
		
		int arr[] = {1212,3,3,45,4543,5565,324,1,12,34,54,545,45,4566,674,3,332,2334,3556};
		
		sort(arr,0, arr.length-1);

		for(int a:arr)
			System.out.print(a+ " ");
		
	}
	
	static void sort(int arr[], int l,int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			
			merge(arr,l,mid,r);
			
		}
		
	}

	static void merge(int arr[],int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2= r-m ;
		
		int L[]= new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			R[j]= arr[m+1+j];
	
	int i=0, j=0;
	
	int k=l;
	
	while(i<n1 && j<n2) {
		if(L[i]<=R[j]) {
			arr[k]=L[i];
			i++;
		}
		else {
			arr[k]=R[j];
			j++;
		}
		k++;
	
	}
	
	while(i<n1) {
		arr[k]=L[i];
		i++;
		k++;
	}
	while(j<n2) {
		arr[k]=R[j];
		j++;
		k++;
	}

	
	}
	
}
