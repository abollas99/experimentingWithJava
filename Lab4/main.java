package Lab4;

public class main{
    public static void main(String[] args) {
        var myLinkedList = new myLinkedList<Integer>();
        //add 4 elements
        for (int i = 1; i < 5; i++) {
        myLinkedList.add(i);
        long begin, end, time; // we will measure time it took
        begin = System.nanoTime();//this code is before the call
        System.out.println("Initial list: " + myLinkedList + ", head element: " + myLinkedList.head.element +
            ", head element next: " + ((myLinkedList.head.next != null)? myLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myLinkedList.tail.element +
            ", tail element next: " + ((myLinkedList.tail.next != null)? myLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myLinkedList.size + "\n");
        end = System.nanoTime(); //this code is before the call
        time = end-begin; //this code the time interval it took
        System.out.println("It took " + time + " nanoseconds");
        }
        //add 4 more in front of the list
        for (int i = 1; i < 5; i++) {
        myLinkedList.addFirst(10+i);
        System.out.println("List after modification: " + myLinkedList +
            ", head element: " + myLinkedList.head.element +
            ", head element next: " + ((myLinkedList.head.next != null)? myLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myLinkedList.tail.element +
            ", tail element next: " + ((myLinkedList.tail.next != null)? myLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myLinkedList.size + "\n");
         }
        //remove 3 last elements
        for (int i = 0; i < 3; i++) {
        myLinkedList.removeLast(); 
        System.out.println("List after removal: " + myLinkedList +
            ", head element: " + myLinkedList.head.element +
            ", head element next: " + ((myLinkedList.head.next != null)? myLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myLinkedList.tail.element +
            ", tail element next: " + ((myLinkedList.tail.next != null)? myLinkedList.tail.next.element.toString(): "null") +
            ", size: " + myLinkedList.size + "\n");
        } 
    }
}