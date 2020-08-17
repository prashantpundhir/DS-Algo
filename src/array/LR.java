package array;

import java.util.Scanner;

public class LR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter no. of characters");
	    int n = scan.nextInt(); //scaning num of strings with nextInt
	    
	    String []s = new String[n];

	    for(int i = 0; i<n ; i++) {
	        String ssi = scan.nextLine();
	    s[i]=ssi;
	}
	    int count =0;
	    

	    for(int i=0;i<n; i++){
	        char[] c= s[i].toCharArray();

	        int sl = s[i].length();

	        for(int j=0;j<sl;j+=2)
	            System.out.print(c[j]);

	        System.out.print(" ");
	        for(int j=1;j<sl;j+=2)
	            System.out.print(c[j]);

	        System.out.println();
	    }

	}

}
