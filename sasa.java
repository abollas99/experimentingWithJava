public class sasa{
    public static void main(String[] args){
        int[] num = {5,1,4,2,8};
        printArray(num);
        num = insertionSort(num);
        System.out.println("\n");
        printArray(num);

    }
    //print array
    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    /*Big O Notation: big O is the measure of time a code takes to run. Quicker code can be known as O(log n 2)
    when there is a double for loop a code is O(n^2) meanwhile a tripple for loop is known as O(n^3)
    */
    //bubble sort
    public static int[] bubbleSort(int[] arr){
        for(int loop = 0; 0 < arr.length; loop++){
            for(int i = 0; i < arr.length-1; i++){
                int j = i + 1;
                if(i > j){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = arr[temp];
                }
            }
        }
        return arr;
    }
    //insertion sort
    public static int[] insertionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int j = i - 1;
            int current = arr[i];
            while(j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }        
        return arr;
    }
    //selection sort
    public static int[] selectionSort(int[] arr){
        for(int i= 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length-1;j++){
                if(arr[min] > arr[j]){
                    int tmp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    //merge sort
    //quick sort
    //heap sort
    //bucket sort
    //radix sort
    //counting sort
    //linear search
    //binary search

}