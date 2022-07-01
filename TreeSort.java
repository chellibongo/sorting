public class TreeSort {
    class Node {
        int key;
        Node left, right;

        //Constructor passing int to add to tree and sets child nodes to null
        public Node(int num) {
            key = num;
            left = right = null;
        }
    }

    Node root;

    //constructor to initialise root to null;
    TreeSort() {
        root = null;
    }

    void insert(int num) {
        root = insertInt(root, num);
    }

    //traverse a binary tree in order from a given node
    void inOrderTraverse(Node root) {
        if(root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.key + " ");
            inOrderTraverse(root.right);
        }
    }
    //insert a new value into a binary tree in order
    Node insertInt(Node root, int num) {
        if (root == null) {
            root = new Node(num);
            return root;
        }
        if(num > root.key) {
            root.right = insertInt(root.right, num);
        } else if(num < root.key) {
            root.left = insertInt(root.left, num);
        }
        return root;
    }

    //creates in order tree from an array of ints
    void buildTree(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            insert(intArray[i]);
        }
    }

    public void sort(int[] intArray) {

    }

    public static void main(String[] args) {
        TreeSort tree = new TreeSort();
        int[] numarray = {2,7,4,5,9,22,33,41,1};
        tree.buildTree(numarray);
        tree.inOrderTraverse(tree.root);
    }
}
