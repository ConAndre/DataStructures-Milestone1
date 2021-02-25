package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import linkedList.LinkedListTester;
import queue.Queue;
import queue.QueueImpl;
import queue.QueueTester;
import stack.Stack;
import stack.StackImpl;
import stack.StackTester;

public class StagBusClient {

	public static void main(String[] args) {
		System.out.println("-----L I N K E D  T E S T------");
		LinkedList linkedList = new LinkedListImpl();
		LinkedListTester.runTests(linkedList);

		System.out.println("-----S T A C K  T E S T------");
		Stack stack = new StackImpl();
		StackTester.runTests(stack);

		System.out.println("----Q U E U E  T E S T-------");
		Queue queue = new QueueImpl();
		QueueTester.runTests(queue);



	}
}
