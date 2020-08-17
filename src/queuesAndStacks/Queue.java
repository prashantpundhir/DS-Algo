package queuesAndStacks;

import java.util.LinkedList;

public class Queue {
	// Creating queue using LinkedList (Queue with LinkedList as a property)
	// isEmpty, enqueue, dequeue, peek, size,

	LinkedList queue;
	
	public Queue() {
		queue = new LinkedList();
	}
	
	public Boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(String s) {
		queue.addLast(s);
	}
	
	public String dequeue() throws IllegalArgumentException{
		if(queue.isEmpty())
			throw new IllegalArgumentException("Queue is empty");
		return (String) queue.remove();
	}
	
	public String peek() {
		return (String) queue.get(0);
	}

	public int size() {
		return queue.size();
	}
	
	public static void main(String[] args) {

		Queue stringQueue = new Queue();
		
		System.out.println("Is queue Empty : " + stringQueue.isEmpty());
		System.out.println("Size: " + stringQueue.size());
		
		try {
		stringQueue.dequeue();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception Handled...");
		}
		
		
		stringQueue.enqueue("Hi");
		stringQueue.enqueue("There");
		stringQueue.enqueue("1");
		System.out.println("Peek " + stringQueue.peek());
		System.out.println("Size " + stringQueue.size());
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		System.out.println("Is queue Empty : " + stringQueue.isEmpty());
		System.out.println("Size: " + stringQueue.size());
		
	}

}
