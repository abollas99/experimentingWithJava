package Lab3;

import java.util.Stack;

public  class StackTask6 {
    public static void main(String[] args){
        Stack<Integer> intStack = new Stack<>();
        System.out.println(intStack.empty());
        intStack.push(5);
        intStack.push(-5);
        System.out.println(intStack.empty());
        intStack.push(21);
        intStack.push(1);
        System.out.println("The Number 5 is number " + intStack.search(5) + " in the stack");
        intStack.push(-10);
        System.out.println(intStack.peek());
        intStack.pop();
        System.out.println(intStack.peek());
        Stack<String> stringStack = new Stack<>();
        System.out.println(stringStack.empty());
        stringStack.push("Apple");
        stringStack.push("Bannana");
        System.out.println(stringStack.empty());
        stringStack.push("Mango");
        stringStack.push("Peach");
        System.out.println("Apple is number " + stringStack.search("Apple") + " in the stack");
        stringStack.push("Strawberry");
        System.out.println(stringStack.peek());
        stringStack.pop();
        System.out.println(stringStack.peek());
    }
}
