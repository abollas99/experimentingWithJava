import java.util.*;
public class Main {
    static Scanner user = new Scanner(System.in);
    public static void main(String[] args)
    {   
        boolean num = areEqualByThreeDecimalPlaces(3.1756, 3.1757);
        System.out.println(num);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {   

        if(num1 < 0 && num2 > 0)
        {
            return false;
        }
        else if(num1 > 0 && num2 < 0)
        {
            return false;
        }
        else
        {

            num1 = (num1 * 1000);
            int newNum1 = (int)num1;

         

            num2 = (num2 * 1000);

            int newNum2 = (int)num2;

            if(newNum1 == newNum2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
