import queue.QueueCircular;
import queue.QueueLinear;

public class Main {
    public static void main(String[] args) {
        //Queue has another types to get FIFO principle
        //Linear Queue
        //size can be changed
        QueueLinear queueLinear = new QueueLinear(20);

        queueLinear.enqueue("Jhonny");//enquee a element
        queueLinear.enqueue("Marie");//enquee a element
        queueLinear.enqueue("Frank");//enquee a element
        queueLinear.enqueue("Isec");//enquee a element

        queueLinear.dequeue(); //dequeue element using FIFO principle
        queueLinear.dequeue(); //dequeue element using FIFO principle

        queueLinear.peek(); //show first element of the queue

        System.out.println(queueLinear); //show the queue


        //Circular Queue
        //
        QueueCircular queueCircular = new QueueCircular(6);

        queueCircular.enqueue("Jhonny");//enquee a element
        queueCircular.enqueue("Marie");//enquee a element
        queueCircular.enqueue("Frank");//enquee a element
        queueCircular.enqueue("Isec");//enquee a element

        queueCircular.dequeue(); //dequeue element using FIFO principle
        queueCircular.dequeue(); //dequeue element using FIFO principle

        queueCircular.enqueue("Isec1");//enquee a element
        queueCircular.enqueue("Isec2");//enquee a element
        queueCircular.enqueue("Isec3");// circular enquee a element
        queueCircular.enqueue("Marie");//circular enquee a element

        queueCircular.enqueue("Frank2");//return overflow

        queueCircular.dequeue(); //dequeue element using FIFO principle
        queueCircular.dequeue(); //dequeue element using FIFO principle

        queueCircular.peek(); //show first element of the queue

        System.out.println(queueCircular); //show the queue






    }
}