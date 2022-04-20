package HW5;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        Main m = new Main();
        long begin, end, time;
        begin = System.nanoTime();
        m.heapSort(arr);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("The Heap sort took " + time + " nanoseconds to complete.");
    }
    public void heapSort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]){
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
