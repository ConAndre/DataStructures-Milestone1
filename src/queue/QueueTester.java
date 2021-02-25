package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl();
		runTests(queue);
	}


	public static void runTests(Queue queue) {
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
