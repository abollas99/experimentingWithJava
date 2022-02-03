package dataStructures.Lab2;


public class lab2 {
    public static void main(String[] args) {
        for(int loop = 0; loop < 5; loop++){
            final int N = 1000000;
            final int KEY = 25;
            int[] list = new int[N];
            
            for (int i = 0; i < N; i++) {
                //generate random positive and negative numbers from -100 to 100
                list[i]= (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
                //System.out.print(list[i] + "," );
            }
            list = selectionSort(list);
            long begin, end, time; // we will measure time it took to search
            //printArr(list);
            begin = System.nanoTime();//we measure in nanoseconds.
            //Starting the watch
            int low = 0;
            int high = list.length-1;
            System.out.println("\n");
            int index = recursiveBinarySearch(list, KEY, low, high);
            System.out.println(index);
            end = System.nanoTime();
            System.out.println("if -1 was return the KEY was not found");
            time = end-begin;
            System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY +
            " on the array of " + N + " elements.");
            }
        }
        public static int binarySearch(int[] sortedArray, int key) {
            int high = sortedArray.length-1;
            int low = 0;
            while(low <= high){
                int mid = (high + low) / 2;
                if(sortedArray[mid] == key){
                    return mid;
                }
                else if(key > sortedArray[mid]){
                    low = mid + 1;
                }
                else if(key < sortedArray[mid]){
                    high = mid - 1;
                }
                else{
                    return -1;
                }
            }
            return -1;
        }
        public static int recursiveBinarySearch(int[] sortedArray, int key, int low, int high){
            int mid = (int)((low + high) / 2);
            if(low <= high && low <= sortedArray.length-1){
                if(sortedArray[mid] < key){
                    recursiveBinarySearch(sortedArray, key, mid+1, high);
                }
                else if(sortedArray[mid] > key){
                    recursiveBinarySearch(sortedArray, key, low, mid-1);
                }
                else if(sortedArray[mid] == key){
                    return mid;
                }
            }
            else{
                mid = -1;
            }
            return mid;   
        }
        public static int[] selectionSort(int arr[]) 
        { 
            int pos;
            int temp;
            for (int i = 0; i < arr.length; i++) 
            { 
                pos = i; 
                for (int j = i+1; j < arr.length; j++) 
               {
                    if (arr[j] < arr[pos])                
                    {
                        pos = j;
                    }
                }
    
                temp = arr[pos];            
                arr[pos] = arr[i]; 
                arr[i] = temp; 
            }
            return arr; 
        }
        public static void printArr(int[] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
        } 
      
}



      


