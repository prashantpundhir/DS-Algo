package linkedList;

public class IntegerOccurenceRecursion {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;

		}
	}
	
	public Node push(Node head, int data) {
		Node n= new Node(data);
		
		n.next= head;
		head= n;
		
		return head;
		
	}

	public int count( Node head, int val) {
		
		if(head==null)
			return 0;
		
		if(head.data==val)
			return 1 + count( head.next, val);
		
		return count(head.next, val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerOccurenceRecursion li = new IntegerOccurenceRecursion();
		Node head=null;
		
		head= li.push(head, 1);
		head= li.push(head, 2);
		head= li.push(head, 1);
		head= li.push(head, 3);
		head= li.push(head, 1);
		head= li.push(head, 4);
		
		System.out.println(li.count(head, 1));
		
	}

}
