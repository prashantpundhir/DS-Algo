package queuesAndStacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BalancedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar1 = {"<>><>>>", "<<><><"};
		int[] ar2 = { 2,2};
		
		
		ArrayList<Integer> ans = bon(ar1, ar2);
		for(Integer i: ans)
			System.out.println(i);
		
	}

		public static ArrayList bon(String []expressions, int []maxReplacements) {
		ArrayList return_array = new ArrayList();
		
		int count =0;

		for(String check_str: expressions) {
		
			int replacement_count = 0;			    
			
			    while(check_str.length()-1>=0) {
			    	int in=0;
			    	int opening_count=0, closing_count=0;    
				    
			    	while(in<check_str.length()) {
						if(check_str.charAt(in) == '<')
							opening_count++;
						else if(check_str.charAt(in) == '>')
							closing_count++;
						in++;
					    }
			    	
			    	if(opening_count > closing_count) {
			    		replacement_count = maxReplacements[count] + 1; 
			    		break;
			    	}          
			    	else if(check_str.charAt(0) == '>') {
			    		
			    		replacement_count += 1;
			    		check_str = check_str.substring(1,check_str.length());
			    			}
			    	else
			    		check_str = check_str.replace("<>","");
			    	}
			
			
			    if(replacement_count <= maxReplacements[count])
		            return_array.add(1);
			    else
			    	return_array.add(0);

			
			   
			    count++;
			}	
	   return return_array;		
	}

}
