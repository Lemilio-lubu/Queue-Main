import java.util.Arrays;

public class QueueM {
    private int sizeQueue;
    private int front;
    private int rear;
    private String[] queue;

    public QueueM(int sizeQueue) {
        this.sizeQueue = sizeQueue;
        this.front = -1; //pointer item from delete element
        this.rear = -1; //pointer item from insert element
        this.queue = new String[sizeQueue]; //string queue
    }


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

    private boolean isFirstElement() {
        return front == -1 && rear == -1;
    }

    private boolean isFull() {
        return front == 0 && rear == sizeQueue - 1;
    }

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

    private boolean isEmpty() {
        return front == -1 && rear == -1;
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

    public void peek() {
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
