package array;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =524275;
        int bin[] = new int[8];
        int index=7;
        while(n>0&& index>=0){
            bin[index]= n%2;
            n=n/2;
            index--;
        }
        
        for(int a:bin)
        	System.out.print(a + " ");

	}

}
