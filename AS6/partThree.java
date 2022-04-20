package AS6;
import java.util.*;
import java.util.Map.Entry;
public class partThree {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Anthony", 22);
        map.put("Dylan", 14);
        map.put("Samantha", 16);
        
        Set<Map.Entry<String, Integer>> newMap = map.entrySet();
        System.out.println("A hashmap of people and their ages \n" + newMap);
        System.out.println("After a year the ages go up by 1");
        for(Map.Entry<String, Integer> var : newMap){
            var.setValue(var.getValue()+ 1);
            System.out.println("Showing getKey method " + var.getKey()); 
        }
        System.out.println("Updated Ages:\n" + newMap);
        
    }
}
