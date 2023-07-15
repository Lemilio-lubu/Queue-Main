
public class Main {
    public static void main(String[] args) {
        //size can be changed
        QueueM queueMain = new QueueM(20);

        queueMain.enqueue("Jhonny");//enquee a element
        queueMain.enqueue("Marie");//enquee a element
        queueMain.enqueue("Frank");//enquee a element
        queueMain.enqueue("Isec");//enquee a element

        queueMain.dequeue(); //dequeue element using FIFO principle
        queueMain.dequeue(); //dequeue element using FIFO principle

        queueMain.peek(); //show first element of the queue

        System.out.println(queueMain); //show the queue

    }
}