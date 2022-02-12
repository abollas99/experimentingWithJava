package Lab3;

import java.util.*;

public class TestCollection {
  public static void main(String[] args) {
    LinkedList<String> collection1 = new LinkedList<>();
    collection1.add("New York"); 
    collection1.add("Atlanta"); 
    collection1.add("Dallas"); 
    collection1.add("Madison"); // Add "Madison" to collection1
    collection1.add("Union"); // add union
    collection1.remove("New York"); // remove NY

    System.out.println("A list of cities in collection1:");
    System.out.println(collection1);

    System.out.println("\nIs Dallas in collection1? "
      + collection1.contains("Dallas"));

    collection1.remove("Dallas");
    System.out.println("\n" + collection1.size() + 
       " cities are in collection1 now");

    Collection<String> collection2 = new LinkedList<>();
    collection2.add("Seattle"); 
    collection2.add("Portland"); 
    collection2.add("Los Angles"); 
    collection2.add("Atlanta");
    collection2.remove("Portland");//remove portland
    collection2.add("Elizabeth");//add elizabeth
    collection2.add("linden");
    collection2.add("Union");

    System.out.println("\nA list of cities in collection2:");
    System.out.println(collection2);

    LinkedList<String> c1 = (LinkedList<String>)(collection1.clone());
    c1.addAll(collection2); // Add all elements in collection2 to c1
    System.out.println("\nCities in collection1 or collection2: ");
    System.out.println(c1);

    c1 = (LinkedList<String>)(collection1.clone());
    c1.retainAll(collection2);
    System.out.print("\nCities in collection1 and collection2: ");
    System.out.println(c1);

    c1 = (LinkedList<String>)(collection1.clone());
    c1.removeAll(collection2);
    System.out.print("\nCities in collection1, but not in 2: ");
    System.out.println(c1);
  }
}