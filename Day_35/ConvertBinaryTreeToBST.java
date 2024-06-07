package Day_35;

import java.util.ArrayList;
import java.util.Collection;

class Node {
    int val;
    Node leftChild;
    Node rightChild;

    Node(int data) {
        this.val = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class ConvertBinaryTreeToBST {
    int i = 0;

    Node binaryTreeToBST(Node root) {
        ArrayList<Integer> inorderList = new ArrayList<>();
        inOrder(root, inorderList);
        // Collection.(inorderList);
        inorderList.sort(null);
        i = inorderList.size() - 1;

        makeBST(root, inorderList);
        return root;
    }

    void inOrder(Node root, ArrayList<Integer> inorderList) {
        if (root == null)
            return;
        inOrder(root.leftChild, inorderList);
        inorderList.add(root.val);
        inOrder(root.rightChild, inorderList);
    }

    void makeBST(Node root, ArrayList<Integer> inorderList) {
        if (root == null || i < 0)
            return;
        makeBST(root.rightChild, inorderList);
        root.val = inorderList.get(i);
        i--;
        makeBST(root.leftChild, inorderList);
    }
}
