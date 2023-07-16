package queue;

public class QueueCircular extends QueueM {
    private final int sizeQueueC;

    public QueueCircular(int sizeQueue) {
        super(sizeQueue);
        this.sizeQueueC = sizeQueue;
    }

    @Override
    public void enqueue(String element) {
        //check is full
        if (isFull()) {
            System.out.println("overflow");
            return;
        }
        //look if it is the first element
        if (isFirstElement()) {
            front = 0;
            rear = 0;
            queue[rear] = element;
            return;
        }
        //check if we need a circular increase
        if (isCircularIncrease(rear)) {
            rear = 0;
            queue[rear] = element;
            return;
        }
        //enqueue
        rear += 1;
        queue[rear] = element;
    }

    private boolean isCircularIncrease(int pointer) {
        return pointer == sizeQueueC - 1;
    }

    private boolean isFirstElement() {
        return front == -1 && rear == -1;
    }

    private boolean isFull() {
        return (front == 0 && rear == sizeQueueC - 1) || rear + 1 == front;
    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("underflow");
            return;
        }
        if (isLastElement()) {
            queue[front] = null;
            front = -1;
            rear = -1;
            return;
        }
        if (isCircularIncrease(front)) {
            queue[front] = null;
            front = 0;
        }
        queue[front] = null;
        front += 1;

    }

    private boolean isLastElement() {
        return front == rear;
    }

}
