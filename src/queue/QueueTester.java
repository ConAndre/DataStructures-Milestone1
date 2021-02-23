package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl();
		queue.isFull();
		queue.isEmpty();
		queue.display();
		queue.peek();
	}

}
