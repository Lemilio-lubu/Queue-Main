package queue;

public class QueueLinear extends QueueM {
    private final int sizeQueueL;

    public QueueLinear(int sizeQueue) {
        super(sizeQueue);
        this.sizeQueueL = sizeQueue;
    }

    @Override
    public void enqueue(String element) {
        //check is full
        if (isFull()) {
            System.out.println("overflow");
            return;
        }
        //look if it is the first element we add
        if (isFirstElement()) {
            front = 0;
            rear = 0;
            queue[rear] = element;
            return;
        }
        //add element
        rear += 1;
        queue[rear] = element;
    }
    private boolean isFull() {
        return front == 0 && rear == sizeQueueL - 1;
    }
    private boolean isFirstElement() {
        return front == -1 && rear == -1;
    }
    @Override
    public void dequeue() {
        //check if queue is empty
        if (isEmpty()) {
            System.out.println("underflow");
            return;
        }
        //look if the last element we delete
        if (isLastElement()) {
            queue[front] = null;
            front = -1;
            rear = -1;
            return;
        }
        //delete a element
        modifyQueue();
        rear--; // decrease rear queue

    }


    private boolean isLastElement() {
        return front == rear;
    }
    private void modifyQueue() {
        //add auxiliar value that keeps value of front
        int auxValue = front;
        //loop that runs until it reaches the rear
        while (auxValue < rear) {
            //extract the next element
            String element = queue[auxValue + 1];
            //change the place
            queue[auxValue + 1] = null;
            //add at empty space
            queue[auxValue] = element;
            auxValue++;
        }
    }
}
