public class ConstructTreeFromPreorder {
    public static void main(String[] args) {
        int[] preorder = { 8, 5, 1, 7, 10, 12 };
        Node root = constructTree(preorder, 0, preorder.length - 1);
        System.out.println("Inorder traversal of the constructed tree is ");
        inorder(root);
    }

    static Node constructTree(int[] preorder, int start, int end) {
        if (start > end)
            return null;
        Node root = new Node(preorder[start]);
        int i;
        for (i = start; i <= end; i++) {
            if (preorder[i] > root.data)
                break;
        }
        root.left = constructTree(preorder, start + 1, i - 1);
        root.right = constructTree(preorder, i, end);
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node post_order(int p[], int size) {
        //Java solution
        return fun(p, 0, p.length - 1);
    }

     static Node fun(int[] p, int s, int e){
         if(s > e) return null;
         int i = s;
         Node root=new Node(p[s]);

         while(i <= e && p[i] <= p[s]){
             i++;
         }

         root.left = fun(p, s+1, i-1);
         root.right = fun(p, i, e);
         return root;
     } 
}