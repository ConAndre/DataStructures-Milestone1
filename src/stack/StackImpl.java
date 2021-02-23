package stack;

public class StackImpl implements Stack {

    private String[] stack;
    private static final int INITIAL_SIZE = 10;
    private final boolean debugMode = true;

    public StackImpl() throws ExceptionInInitializerError {
        if (INITIAL_SIZE <= 0) throw new ExceptionInInitializerError("Invalid INITIAL_SIZE");
        this.stack = new String[INITIAL_SIZE];

        if (debugMode) {
            this.stack[0] = "Test0";
            this.stack[1] = "Test1";
            this.stack[2] = "Test2";
            this.stack[3] = "Test3";
            this.stack[4] = "Test4";
            this.stack[5] = "Test5";
        }
    }

    @Override
    public void push(String s) {
        String[] newArray = new String[stack.length+1];
        newArray[0] = s;
        System.arraycopy(stack, 0, newArray, 1, newArray.length-1);
        this.stack = newArray;
    }

    @Override
    public String pop() throws RuntimeException {
        if (stack.length == 0 ) {
            throw new RuntimeException("There exists no value to pop!");
        }
        String[] newArray = new String[stack.length-1];
        String poppedString = stack[0];

        System.arraycopy(stack, 1, newArray, 0, stack.length-1);
        this.stack = newArray;
        return poppedString;
    }

    @Override
    public Boolean isEmpty() {
        if (debugMode) {
            System.out.print("Empty? ");
            System.out.println(stack[0] == null);
            System.out.println("Stack First Element: " + stack[0]);
        }
        return stack[0] == null; //fine bc Boolean can support more than boolean
    }

    @Override
    public Boolean isFull() {
        if (debugMode) {
            System.out.print("Full? ");
            System.out.println(stack[stack.length-1] != null);
            System.out.println("Queue Last Element: " + stack[stack.length-1]);
        }
        return stack[stack.length-1] != null;
    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public String peek() {
        return stack[stack.length-1];
    }

    private void capacityDebugPrint(int size, String[] newArray) {
        System.out.println("Stack.length: " + stack.length);
        System.out.println("Size: " + size);
        int count = 0;
        System.out.println("Current Stack: ");
        for (String i : stack) {
            System.out.print("[" + count + "] " + i + " ");
            count++;
        }
        System.out.println("\nNew Stack: ");
        count = 0;
        for (String i : newArray) {
            System.out.print("[" + count + "] " + i + " ");
            count++;
        }
        System.out.println();

    }

    @Override
    public void setCapacity(int size) throws IllegalArgumentException {
        if (size < 0) throw new IllegalArgumentException("Parameter cannot be negative!");
        String[] newArray = new String[size];

        if (debugMode) {
            capacityDebugPrint(size, newArray);
        }
        // Try blocks are more expensive but more readable code. Not gonna be an issue here.
        try {
            String warning = "Warning: Data will be lost from indices "
                    + "[" + (size+1) + "]-[" + (stack.length-1) + "]!";
            if (stack[size] != null) {
                System.out.println(warning);
            }
        } catch (Exception ignored) {}

        System.arraycopy(stack, 0, newArray, 0, Math.min(size, stack.length));

        this.stack = newArray;

        if (debugMode) {
            capacityDebugPrint(size, newArray);
        }
    }

    @Override
    public void display() {
        int count = 0;
        System.out.println("Current Queue: ");
        for (String i : stack) {
            if (i == null) i = "<Empty>";
            System.out.println("[" + count + "] " + i);
            count++;
        }
    }
}
