package stack;

public class StackTester {

	public static void main(String[] args) {
 		Stack stack = new StackImpl();
 		runTests(stack);
	}
	
	public static void runTests(Stack stack) {

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
		stack.display();
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

	}
}
