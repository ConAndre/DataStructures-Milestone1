package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedListImpl();
		runTests(linkedList);
	}
	public static void runTests(LinkedList linkedList) {
		linkedList.listItems();

		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("ItemOne"));
		linkedList.listItems();

		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("ItemTwo"));
		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("ItemThree"));
		linkedList.listItems();

		System.out.println("Attempting to add after an element... RESULT: " +
				linkedList.insertAfter("ItemAfterOne", "ItemOne"));
		linkedList.listItems();

		System.out.println("Attempting to add before an element... RESULT: " +
				linkedList.insertBefore("ItemBeforeOne", "ItemOne"));
		linkedList.listItems();

		System.out.println("Attempting to check if item is in list... RESULT: " +
				linkedList.isItemInList("ItemBeforeOne"));
		linkedList.listItems();

		System.out.println("Attempting to remove item from list... RESULT: " +
				linkedList.deleteItem("ItemBeforeOne"));
		linkedList.listItems();

		System.out.println("Attempting to check if item is in list... RESULT: " +
				linkedList.isItemInList("ItemBeforeOne"));
		linkedList.listItems();

		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("ItemThree")); // Repeat element
		linkedList.listItems();

		System.out.println("Attempting to add repeat after an element... RESULT: " +
				linkedList.insertAfter("ItemTwo", "ItemTwo")); // Repeat Element
		linkedList.listItems();

		System.out.println("Attempting to add after an element... RESULT: " +
				linkedList.insertAfter("ItemAfterTwo", "ItemTwo"));
		linkedList.listItems();

		{
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemOne"));
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemAfterOne"));
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemTwo"));
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemAfterTwo"));
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemTwo"));
			System.out.println("Attempting to remove item from list... RESULT: " +
					linkedList.deleteItem("ItemThree"));
			linkedList.listItems();

		}

		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("NewItem"));
		linkedList.listItems();
		System.out.println("Attempting to add to list... RESULT: " +
				linkedList.addItem("NewItemTwo"));
		linkedList.listItems();

		System.out.println("Attempting to remove item from list... RESULT: " + // not case matching
				linkedList.deleteItem("newitemtwo"));
		linkedList.listItems();






	}

}
