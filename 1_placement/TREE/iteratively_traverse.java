import java.util.Stack;

// Class containing left and right child of
// current node and key value
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}


public class iteratively_traverse {


// Class to perform non-recursive tree traversals
    Node root;

    // Non-recursive inorder traversal
    void inorder() {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    // Non-recursive preorder traversal
    void preorder() {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    // Non-recursive postorder traversal
    void postorder() {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Stack<Integer> output = new Stack<>();

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            output.push(curr.data);

            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        while (!output.isEmpty()) {
            System.out.print(output.pop() + " ");
        }
    }

    public static void main(String args[]) {
        // Creating a binary tree and entering the nodes
        iteratively_traverse tree = new iteratively_traverse();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Perform non-recursive traversals
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();

        System.out.println("\nPreorder traversal of the binary tree:");
        tree.preorder();

        System.out.println("\nPostorder traversal of the binary tree:");
        tree.postorder();
    }

}