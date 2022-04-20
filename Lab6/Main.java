package Lab6;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        var bst = new BST<Integer>();
        bst.insert(1);
        bst.insert(1);
        bst.insert(8);
        bst.insert(4);
        bst.insert(0);
        bst.insert(7);
        bst.insert(0);
        bst.inorder();
    }
}
