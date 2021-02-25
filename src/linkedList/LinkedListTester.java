package linkedList;

import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedListImpl();
		runTests(linkedList);
	}
	public static void runTests(LinkedList linkedList) {

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







	}

}
