public class TestBST {
    public static void main(String[] args) {
        Integer[] numbers = {5, 4, 8, 3, 7, 1};
        BST<Integer> intTree = new BST<>(numbers);
        long time, begin, end;
        begin = System.nanoTime();
        intTree.search(9);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("It took " + time + " nanosecond to search for 9.");
        intTree.inorder();
       }
   }