package dataStructures;

public class lab2 {
    public static void main(String[] args) {
        final int N = 10000;
        final int KEY = -1;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            //generate random positive and negative numbers from -100 to 100
            list [i]= (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            //print them
            System.out.print(list[i] + "," );
        }
        //sort list
        list = selectionSort(list);
        long begin, end, time; // we will measure time it took to search
         begin = System.nanoTime();//we measure in nanoseconds.
         //Starting the watch
         int low = 0;
         int high = list.length-1;
         int mid = (int)(low + (high - low) / 2);
         System.out.println("\n");
         System.out.println(recursiveBinarySearch(list, KEY, low, high, mid));
         end = System.nanoTime();
         System.out.println("if -1 was return the KEY was not found");
         time = end-begin;
         System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY +
        " on the array of " + N + " elements.");
        }

    public static int recursiveBinarySearch(int[] array, int x, int low, int high, int mid){
        if(array.length % 2 != 0 && low <= high){//check for 1 middle number
            if (array[mid] == x){
              return mid;
            }
            else if(array[mid] < x){
              low = mid + 1;
              mid =(int)(low + (high - low) / 2);
              recursiveBinarySearch(array, x, mid, high, mid);
            }
            else{
              high = mid - 1;
              mid = (int)(low + (high - low) / 2);
              recursiveBinarySearch(array, x, low, high, mid);
            }
        }
        else if (array.length % 2 == 0 && low < high){//check for 2 middle numbers
            int mid2 = mid + 1;
            if (array[mid] == x){
                return mid;
            }
            else if (array[mid2] == x){
                return mid2;
            }
            else if(array[mid] < x){
            low = mid + 1;
            mid = (int)(low + (high - low) / 2);
            recursiveBinarySearch(array, x, mid+1, high, mid);
            }
            else{
            high = mid - 1;
            mid = (int)(low + (high - low) / 2);
            recursiveBinarySearch(array, x, low, high, mid);
            }
        }
        return -1;
    }
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
}



      


