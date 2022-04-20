package AS1;

public class recursion {
    public static void main(String[] args){
        //int[] arr = makeArr();
        function(5);
    }





    public static void function(int i ){
        if(i > 0){
            System.out.println("Hello");
        function(i-1);
        System.out.println("after recursion");
        }
        else{
            System.out.println("else");
        }

    }










    
    public static int[] makeArr(){
        int[] arr = new int[5];
        for(int i = 4; i >= 0; i--){
            arr[i] = i * 2;
        }
        return arr;
    }
    
}
