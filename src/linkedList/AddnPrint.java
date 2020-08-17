package linkedList;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class AddnPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li =new LinkedList<>();
		
		li.add(3);
		li.add(5);
		li.add(10);
		
		for(int i : li)
			System.out.println(i);
		

	}

}
