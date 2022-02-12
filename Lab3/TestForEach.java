package Lab3;

import java.util.*;

public class TestForEach {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 
    Collection<Integer> collection2 = new ArrayList<>();
    collection2.add(0);
    collection2.add(0);
    collection2.add(1);
    collection2.add(1);
    collection2.add(9);
    collection2.add(7);
    collection2.add(6);
    collection2.add(5);
    collection2.add(1);
    collection2.forEach(e -> System.out.print((Math.log(e)) + " "));

    System.out.print("\n");

    collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
  }
}