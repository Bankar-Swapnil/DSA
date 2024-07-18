    // Java program to check if a binary tree is symmetric
    class Node {
        int key;
        Node left, right;
    
        Node(int item) {
            key = item;
            left = right = null;
        }
    }
public class isMirror {

    Node root;

    // Returns true if trees with roots as root1 and root2 are mirrors
    boolean isMirror1(Node node1, Node node2) {
        // If both trees are empty, then they are mirror images
        if (node1 == null && node2 == null)
            return true;

        // For two trees to be mirror images, the following conditions must be true:
        // 1.) Their root node's key must be the same
        // 2.) Left subtree of the left tree and right subtree of the right tree have to be mirror images
        // 3.) Right subtree of the left tree and left subtree of the right tree have to be mirror images
        return (node1 != null && node2 != null && node1.key == node2.key
                && isMirror1(node1.left, node2.right) && isMirror1(node1.right, node2.left));
    }

    // Returns true if the tree is symmetric, i.e., mirror image of itself
    boolean isSymmetric() {
        // Check if the tree is a mirror of itself
        return isMirror1(root, root);
    }

    // Driver code
    public static void main(String args[]) {
        isMirror tree = new isMirror();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(3);

        boolean output = tree.isSymmetric();
        if (output)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }

}
