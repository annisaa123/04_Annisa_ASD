/**
 * SLLMain04
 */
public class SLLMain04 {

    public static void main(String[] args) {
        LinkedList04 myLinkedList04 = new LinkedList04();
        myLinkedList04.print();
        myLinkedList04.addFirst(800);
        myLinkedList04.print();
        myLinkedList04.addFirst(700);
        myLinkedList04.print();
        myLinkedList04.addLast(500);
        myLinkedList04.print();
        myLinkedList04.insertAfter(700, 300);
        myLinkedList04.print();
        myLinkedList04.insertAt(3, 400);
        myLinkedList04.print();

        System.out.println("Data pada indekx ke-1 : " + myLinkedList04.gedData(1));
        System.out.println("Data 300 berada pada indeks ke:" + myLinkedList04.indexOf(300));

        myLinkedList04.remove(300);
        myLinkedList04.print();
        myLinkedList04.removeFirst();
        myLinkedList04.print();
        myLinkedList04.removeLast();
        myLinkedList04.print();
    }
}