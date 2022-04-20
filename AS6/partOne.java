package AS6;
import java.util.*;
public class partOne {
    public static void main(String[] args){
        String[] listNum = {"2","7","2","3","4","1","7","2","3"};
        List listNumbers = new ArrayList(Arrays.asList(listNum));
        System.out.println(listNumbers);
        listNumbers.removeAll(Collections.singleton("2"));
        System.out.println(listNumbers);

    }
    
}
