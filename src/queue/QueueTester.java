package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl();
		runTests(queue);
	}


	public static void runTests(Queue queue) {
		queue.display();
		System.out.println("Empty? " + queue.isEmpty());
		System.out.println("Full? " + queue.isFull());
		queue.enQueue("First_In");
		queue.display();
		System.out.println("Empty? " + queue.isEmpty());
		System.out.println("Full? " + queue.isFull());
		queue.enQueue("Second_In");
		queue.enQueue("Third_In");
		queue.enQueue("Fourth_In");
		queue.enQueue("Fifth_In");
		queue.enQueue("Sixth_In");
		queue.enQueue("Seventh_In");
		queue.enQueue("Eighth_In");
		queue.enQueue("Ninth_In");
		queue.enQueue("Tenth_In");
//		queue.enQueue("Eleventh_In"); // Queue is full throws error (intended)
		queue.display();
		System.out.println("Empty? " + queue.isEmpty());
		System.out.println("Full? " + queue.isFull());
		System.out.println("First in queue: " + queue.peek());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		queue.display();
		System.out.println("Empty? " + queue.isEmpty());
		System.out.println("Full? " + queue.isFull());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		System.out.println("dequeuing :  " + queue.deQueue());
		queue.display();
		System.out.println("Empty? " + queue.isEmpty());
		System.out.println("Full? " + queue.isFull());
//		System.out.println("dequeuing :  " + queue.deQueue()); // Queue is empty throws error (intended)
	}

}
