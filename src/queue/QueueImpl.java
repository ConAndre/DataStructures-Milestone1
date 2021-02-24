package queue;

import java.util.Objects;

public class QueueImpl implements Queue {

    private String[] queue;
    private final int MAX_SIZE = 10;
    private final boolean debugMode = true;


    public QueueImpl() {
        assert(MAX_SIZE > 0); // Gonna have problems if it's not
        this.queue = new String[MAX_SIZE];
        if (debugMode) {
            this.queue[0] = "First";
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
    public void enQueue(String element) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        String[] newArray = new String[MAX_SIZE];
        System.arraycopy(queue, 0, newArray, 0, queue.length-1);
        int count = 0;
        for (String i : newArray) {
            if (i == null) {
                break;
            }
            count++;
        }
        newArray[count] = element;
        this.queue = newArray;
    }

    @Override
    public String deQueue() {
        String deQueuedString = Objects.requireNonNull(queue[0], "There exists no value to deQueue! ");
        String[] newArray = new String[MAX_SIZE];
        System.arraycopy(queue, 1, newArray, 0, queue.length-1);
        this.queue = newArray;
        return deQueuedString;
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
