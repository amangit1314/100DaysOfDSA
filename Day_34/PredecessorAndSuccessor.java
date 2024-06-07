class TreeNode {
    int val;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int data) {
        this.val = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class PredecessorAndSuccessor {

    private static TreeNode findSuccessor(TreeNode root, int key) {
        TreeNode successor = null;
        while (root != null) {
            if (key >= root.val) {
                root = root.rightChild;
            } else {
                successor = root;
                root = root.leftChild;
            }
        }
        return successor;
    }

    private static TreeNode findPredecessor(TreeNode root, int key) {
        TreeNode predecessor = null;
        while (root != null) {
            if (root.val >= key) {
                root = root.leftChild;
            } else {
                predecessor = root;
                root = root.rightChild;
            }
        }
        return predecessor;
    }

    public static void main(String[] args) {
        // Create a sample binary search tree
        TreeNode root = new TreeNode(50);
        root.leftChild = new TreeNode(30);
        root.rightChild = new TreeNode(70);
        root.leftChild.leftChild = new TreeNode(20);
        root.leftChild.rightChild = new TreeNode(40);
        root.rightChild.leftChild = new TreeNode(60);
        root.rightChild.rightChild = new TreeNode(80);

        int searchKey = 40;

        TreeNode predecessor = findPredecessor(root, searchKey);
        TreeNode successor = findSuccessor(root, searchKey);

        if (predecessor != null) {
            System.out.println("Predecessor of " + searchKey + " is " + predecessor.val);
        } else {
            System.out.println("Predecessor of " + searchKey + " does not exist");
        }

        if (successor != null) {
            System.out.println("Successor of " + searchKey + " is " + successor.val);
        } else {
            System.out.println("Successor of " + searchKey + " does not exist");
        }
    }
}
