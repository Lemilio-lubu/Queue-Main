package queue;

public abstract class QueueM {
    private int sizeQueue;
    protected int front;
    protected int rear;
    protected String[] queue;

    public QueueM(int sizeQueue) {
        this.sizeQueue = sizeQueue;
        this.front = -1; //pointer item from delete element
        this.rear = -1; //pointer item from insert element
        this.queue = new String[sizeQueue]; //string queue
    }

    public abstract void enqueue(String element);
    public abstract void dequeue();
    protected boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    public void peek(){
        //show the elements using FIFO principle
        if (!isEmpty()) {
            System.out.println(queue[front]);
            return;
        }
        System.out.println("queue empty");
    }

    @Override
    public String toString() {
        String report = "**********QUEUE****************\n[";
        for (String element : queue) {
            report += element + " ,";
        }
        return report + "]\n";
    }
}
