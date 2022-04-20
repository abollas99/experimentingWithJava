package AS6;

import java.util.ArrayList;
import java.util.*;
public class partTwo {
    public static void main(String[] args){
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(4);
        numList.add(14);
        Collection<Integer> finalList = Collections.unmodifiableCollection(numList);
        System.out.println(finalList);
        finalList.add(2);
        
    }
}
