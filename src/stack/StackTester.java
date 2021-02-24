package stack;

public class StackTester {

	public static void main(String[] args) {
 		Stack stack = new StackImpl();
 		runTests(stack);
	}
	
	public static void runTests(Stack stack) {
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		stack.push("First_In");
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		stack.push("Second_In");
		stack.push("Third_In");
		stack.push("Fourth_In");
		stack.push("Fifth_In");
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		System.out.println("Peeking at top: " + stack.peek());
		System.out.println("Popping: " + stack.pop());
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		System.out.println("Resizing Stack size!");
		stack.setCapacity(2);
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		stack.setCapacity(1);
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
//		stack.setCapacity(0); // Stack must be positive non-zero error (intended)
		stack.setCapacity(15);
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		stack.push("NewItem");
		stack.display();
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());

	}
}
