package lab5SAA;

public class quickSortTask {
    public static void main(String[] args){
        for(int j = 0; j < 5; j++){
            long begin, end, time;
            int[] arr = new int[10000000];
            for(int i = 0; i < arr.length; i++){
                arr[i]= (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
            }
            begin = System.nanoTime();
            quickSort(arr);
            end = System.nanoTime();
            time = end - begin; 
            System.out.println("An array with " + arr.length + " elements took " + time + " nanoseconds");
        }
    }
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
        }
    
    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
          int pivotIndex = partition(list, first, last);
          quickSort(list, first, pivotIndex - 1);
          quickSort(list, pivotIndex + 1, last);
        }
    }
    
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; 
        int low = first + 1; 
        int high = last; 
    
        while (high > low) {
          while (low <= high && list[low] <= pivot)
            low++;
    
          while (low <= high && list[high] > pivot)
            high--;
    
          if (high > low) {
            int temp = list[high];
            list[high] = list[low];
            list[low] = temp;
            }
        }
    
        while (high > first && list[high] >= pivot)
          high--;

        if (pivot > list[high]) {
          list[first] = list[high];
          list[high] = pivot;
          return high;
        }
        else 
        {
          return first;
        }
    }
}  


