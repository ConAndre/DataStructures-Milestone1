package queue;

public class QueueImpl implements Queue {

    private final String[] queue;
    private final int MAX_SIZE = 10;
    private final boolean debugMode = true;


    public QueueImpl() {
        assert(MAX_SIZE >= 0); // Gonna have problems if it's not
        this.queue = new String[MAX_SIZE];
        if (debugMode) {
            this.queue[0] = "Test0";
            this.queue[1] = "Test1";
            this.queue[2] = "Test2";
            this.queue[3] = "Test3";
            this.queue[4] = "Test4";
            this.queue[5] = "Test5";
        }
    }

    @Override
    public boolean isFull() {
        if (debugMode) {
            System.out.print("Full? ");
            System.out.println(queue[MAX_SIZE-1] != null);
            System.out.println("Queue Last Element: " + queue[MAX_SIZE-1]);
        }
        return queue[MAX_SIZE-1] != null;
    }

    @Override
    public boolean isEmpty() {
        if (debugMode) {
            System.out.print("Empty? ");
            System.out.println(queue[0] == null);
            System.out.println("Queue First Element: " + queue[0]);
        }
        return queue[0] == null;
    }

    @Override
    public void enQueue(String element) {
    }

    @Override
    public String deQueue() {
        return null;
    }

    @Override
    public void display() {
        int count = 0;
        System.out.println("Current Queue: ");
        for (String i : queue) {
            if (i == null) i = "<Empty>";
            System.out.println("[" + count + "] " + i);
            count++;
        }
    }

    @Override
    public String peek() {
        String firstElement = queue[0];
        if (firstElement == null) firstElement = "<Empty>";
        return firstElement;
    }
}
