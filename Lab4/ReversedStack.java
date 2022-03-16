package Lab4;

import java.util.Stack;

public class ReversedStack {
    static Stack<Character> st = new Stack<>();
    public static void main(String[] args) { 
        System.out.println("Stack size is 10,000,000");
        long begin, end, time;
        for (int i = 1; i <= 10000; i++){
            st.push((char) i);
            //System.out.println("Initial stack bottom to top: " + s);
            //System.out.println("Stack after calling the method: " + s);
        }
        begin = System.nanoTime();
        reverse();
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Took " + time + " nanoseconds");
    }
    public static <E extends Comparable<E>> Stack<E> reversedStack(Stack <E> stack) {
        Stack<E> temp = new Stack<>();
        while(!stack.isEmpty()) //push all elements to temp stack 
            temp.push(stack.pop());
        return temp;
    }
    static void insert_at_bottom(char x)
    {
        if(st.isEmpty())
            st.push(x);
        else
        {
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }
    static void reverse()
    {
        if(st.size() > 0)
        {
            char x = st.peek();
            st.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
}
