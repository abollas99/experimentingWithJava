package Review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//reverse a Q using a stack, array, and list
//In this sample im using my student id as elements in the Queue
public class QueueSample<E>{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Using an array to reverse a queue");
        resetQueue(q);
        System.out.println(q);
        reverseArray(q);
        System.out.println(q);
        System.out.println("Using a Stack to reverse a queue");
        resetQueue(q);
        System.out.println(q);
        reverseStack(q);
        System.out.println(q);
        System.out.println("Using a LinkedList to reverse a Queue");
        resetQueue(q);
        System.out.println(q);
        reverseLinkedList(q);
        System.out.println(q);
    }
    public static void reverseStack(Queue q){
        Stack<Integer> s = new Stack<>();
        //move elements from queue into stack
        for(int i = 0; i < q.size();){
            s.push((Integer) q.remove());
        }
        //since a stack is LiFo when the elements are popped back into queue they will be reversed already
        for(int j = 0; j < s.size();){
            q.add(s.pop());
        }
    }
    public static void reverseArray(Queue q){
        //Create an array to store elements of Queue
        int[] arr = new int[q.size()];
        //Remove elements from Queue and add them to array in a reverse order
        for(int i = q.size()-1; i >= 0; i--){
            arr[i] = (int)(q.remove());
        }
        //adds the reveresed arrea back into the queue
        for(int j = 0; j < arr.length; j++){
            q.add(arr[j]);
        }
    }
    public static void reverseLinkedList(Queue q){
        LinkedList<Integer> l = new LinkedList<>();
        //add all new items to the beginning of linked list, therfore the first item will be at the end of the list
        for(int i = 0; i < q.size();){
            l.addFirst((Integer)q.remove());
        }
        //since the linked list is already reverse move it back into queue
        for(int j = 0; j < l.size();){
            q.add(l.pop());
        }
    }
    public static void resetQueue(Queue q){
        q.clear();
        q.add(0);
        q.add(0);
        q.add(1);
        q.add(1);
        q.add(9);
        q.add(7);
        q.add(6);
        q.add(5);
        q.add(1);
    }
}