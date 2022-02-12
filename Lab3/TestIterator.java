package Lab3;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new LinkedList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    var iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().substring(0,1).toUpperCase() + " ");
    }
    System.out.println();
    System.out.print("|");
    for(String var : collection){
      System.out.print(var.substring(0,1).toUpperCase() + "|");
    }
  }
}