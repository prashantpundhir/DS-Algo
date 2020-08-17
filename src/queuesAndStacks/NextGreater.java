package queuesAndStacks;

import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={10, 4, 2, 20, 40, 12, 30};
		
		nextGreater(arr);
		
		//need to update the code
	}
	
	public static void nextGreater(int arr[]) {
		
		int n= arr.length;
		Stack<Integer> s = new Stack<>();
		
		s.push(arr[n-1]);
		System.out.print(-1 + " ");
		
		for(int i=n-2;i>=0;i--) {
			
			while(!s.empty() && s.peek()<arr[i])
				s.pop();
			
			
			if(s.empty())
				System.out.print(-1 + " ");
			else
				System.out.print(s.peek() + " ");
			
			
			s.push(arr[i]);
		}
		
		
		
	}

}
