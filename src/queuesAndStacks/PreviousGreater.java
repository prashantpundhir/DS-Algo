package queuesAndStacks;

import java.util.Stack;

public class PreviousGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10, 4, 2, 20, 40, 12, 30};
		previousGreater(arr);

	}

	public static void previousGreater(int []arr) {
		
		Stack<Integer> s = new Stack<>();
		
		s.push(arr[0]);
		
		System.out.print(-1 + " ");
		
		for(int i=1;i<arr.length;i++) {
			
			while(!s.empty() && s.peek() < arr[i])
				s.pop();
			
			if(s.empty())
				System.out.print(-1 + " ");
			else
				System.out.print(s.peek() + " ");
			
			s.push(arr[i]);
			
			
			
		}
		
	}
	
}
