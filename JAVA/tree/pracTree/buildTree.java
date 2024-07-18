public class buildTree {
    // Node class representing a node in the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Base class for Binary Tree
public class BinaryTreeBase {
    TreeNode root;

    // Constructor
    public BinaryTreeBase() {
        root = null;
    }

    // Method to insert a new node in the binary tree
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // Recursive method to insert a new node in the binary tree
    private TreeNode insertRec(TreeNode root, int val) {
        // If the tree is empty, create a new node and return it
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        // Otherwise, recur down the tree
        if (root.left == null) {
            root.left = insertRec(root.left, val);
        } else {
            root.right = insertRec(root.right, val);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Method to perform in-order traversal and print the nodes
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // Method to print the entire tree
    public void printTree() {
        System.out.print("Binary Tree: ");
        inOrderTraversal(root);
        System.out.println();
    }
}

// Binary Tree class
class BinaryTree extends BinaryTreeBase {
    // No additional methods needed for a basic Binary Tree
}

// Binary Search Tree class
class BinarySearchTree extends BinaryTreeBase {
    // Method to insert a new node in the binary search tree
    @Override
    public void insert(int val) {
        root = insertBST(root, val);
    }

    // Recursive method to insert a new node in the binary search tree
    private TreeNode insertBST(TreeNode root, int val) {
        // If the tree is empty, create a new node and return it
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        // Otherwise, recur down the tree
        if (val < root.val) {
            root.left = insertBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertBST(root.right, val);
        }

        // Return the unchanged node pointer
        return root;
    }
}

// Main class to test the BinaryTree and BinarySearchTree classes
public class Main {
    public static void main(String[] args) {
        BinaryTreeBase treeBase = new BinaryTreeBase();
        treeBase.insert(5);
        treeBase.insert(3);
        treeBase.insert(7);
        treeBase.insert(2);
        treeBase.insert(4);
        treeBase.insert(6);
        treeBase.insert(8);
        treeBase.printTree();

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.printTree();
    }
}

}
