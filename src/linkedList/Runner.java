package linkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtStart(10);
		list.insert(5);
		list.insert(12);
		list.insert(18);

		list.insertAtStart(25);
		list.show();
		list.insertAtIndex(2, 52);
		list.show();
		list.insertAtIndex(0, 512);
		list.show();
//		list.deleteAt(2);
		
		list.show();
		System.out.println(list.findMid());
		
		//to create loop remove // from below statement
		//list.head.next.next.next.next = list.head;
		 System.out.println("Head: " + list.head.data);
		list.detectLoop();
		
		list.reverseLinkedList();
		list.show();
		
		LinkedList li2 =new LinkedList();
		li2.insert(1);
		li2.insert(2);
		li2.insert(3);
		li2.insert(2);
		li2.insert(1);
		
		System.out.println(li2.findPalindrome());
		
		list.rotateLinkedList(2);
		list.show();
		
	
	}

}
