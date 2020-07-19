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
		list.deleteAt(2);
		
		list.show();
	}

}
