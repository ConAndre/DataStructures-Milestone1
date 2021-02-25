package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then
		LinkedList linkedList = new LinkedListImpl();
		Stack stack = new StackImpl();
		Queue queue = new QueueImpl();

		System.out.println("-----L I S T  T E S T------");
		
		linkedList.addItem("Station 1");
		linkedList.addItem("Station 2");
		linkedList.addItem("Station 3");
		linkedList.addItem("Station 4");
		linkedList.listItems();
		System.out.println("Station 4 in list? " + linkedList.isItemInList("Station 4"));
		System.out.println();

		linkedList.deleteItem("Station 3");
		linkedList.listItems();
		System.out.println();

		linkedList.insertBefore("Station 3_BEFORE", "Station 4");
		linkedList.listItems();
		System.out.println();

		linkedList.insertAfter("Station 5", "Station 4");
		linkedList.listItems();
		System.out.println();


		System.out.println("-----S T A C K  T E S T------");

	 	stack.push("Jack");
	 	stack.push("Jeff");
	 	stack.push("Jimmy");
	 	stack.push("Jeremy");
	 	stack.push("John");
	 	stack.push("Jello");
	 	stack.display();
	 	System.out.println();

	 	System.out.println("Peeking at stack: " + stack.peek());
		stack.display();
		System.out.println();

		stack.pop();
		stack.display();
		System.out.println("Peeking at stack: " + stack.peek());
		System.out.println();

		stack.push("Mongo");
		stack.push("Model");
		System.out.println();
		System.out.println("Peeking at stack: " + stack.peek());
		System.out.println();

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		System.out.println();

		System.out.println("Empty? " + stack.isEmpty());
		System.out.println();

		System.out.println("----Q U E U E  T E S T-------");

		queue.enQueue("Charles");
		queue.enQueue("Ryan");
		queue.enQueue("Larence");
		queue.enQueue("Casey");
		queue.enQueue("Katty");
		queue.enQueue("Lukey");
		queue.display();
		System.out.println();

		System.out.println("Peeking at queue: " + queue.peek());
		System.out.println();

		queue.deQueue();
		queue.display();
		System.out.println();

		queue.enQueue("Pizza");
		queue.enQueue("Doc");
		System.out.println();

		System.out.println("Peeking at queue: " + queue.peek());
		System.out.println();

		System.out.println("Dequeueing...");
		System.out.println();
		queue.deQueue();
		queue.display();


	}
}
