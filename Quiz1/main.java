package Quiz1;
import java.util.Arrays;

public class main {

   static void max(Vegetable[] vegetables) {
       Arrays.sort(vegetables);
       System.out.println();
       System.out.println("Highest cost: " + vegetables[vegetables.length - 1]);
   }

}
