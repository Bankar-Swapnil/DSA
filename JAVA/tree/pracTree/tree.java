import java.util.*;

public class tree {

    public static class node{
        int data;
        node left;
        node right;

        node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }


    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }



    public static void levelOrder(node root){
        if(root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }


    public static int sumAtKthLevel(node root,int k){
        if(root==null){
            return -1;
        }

        Queue<node> q = new LinkedList<>();
        if(k==0){
            return root.data;
        }
        q.add(root);
        q.add(null);

        int level=0;
        int sum=0;

        while (!q.isEmpty()) {
            node curr=q.remove();

            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level+=1;
                }
            }else{
                if(k==level){
                    sum+=curr.data;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sum;
    }



    public static int hightOfTree(node root){
        if(root==null){
            return 0;
        }
        int leftHight=hightOfTree(root.left);
        int rightHight= hightOfTree(root.right);

        return Math.max(leftHight,rightHight)+1;
    }

    public static int sumOfAllNodes(node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfAllNodes(root.left);
        int rightSum = sumOfAllNodes(root.right);

        return leftSum+rightSum+root.data;
    }



    public static void leftView(node root){
        if(root==null){
            return;
        }
        Queue<node> q  = new LinkedList<>();
        q.add(root);
        

        while (!q.isEmpty()) {

            int n = q.size();

            for(int i=0;i<n;i++){
                node curr = q.remove();
                if(i==0){
                    System.out.print(curr.data+" ");
                }if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }


    public static void rightView(node root){
        if(root==null){
            return;
        }
        Queue<node> q  = new LinkedList<>();
        q.add(root);
        

        while (!q.isEmpty()) {

            int n = q.size();

            for(int i=0;i<n;i++){
                node curr = q.remove();
                if(i==n-1){
                    System.out.print(curr.data+" ");
                }if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }



    public static int TotalNodes(node root){
        if(root==null){
            return 0;
        }
        int l=TotalNodes(root.left);
        int r = TotalNodes(root.right);

        return l+r+1;
    }


    public static int diameterOfTree(node root){
        if(root==null){
            return 0;
        }

        int lh=hightOfTree(root.left);
        int rh = hightOfTree(root.right);

        int th = lh+rh+1;  

        int ld = diameterOfTree(root.left);
        int rd = diameterOfTree(root.right);

        return Math.max(th,Math.max(ld, rd));
    }


    public static void sumReplaced(node root){
        if(root==null){
            return;
        }

        sumReplaced(root.left);
        sumReplaced(root.right);
        if(root.left!=null){
            root.data+=root.left.data;
        }
        if(root.right!=null){
            root.data+=root.right.data;
        }
    }




    static boolean ifNodeExists(node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        // then recur on the left subtree
        boolean res1 = ifNodeExists(root.left, key);

        // node found, no need to look further
        if (res1)
            return true;

        // node is not found in the left,
        // so recur on the right subtree
        boolean res2 = ifNodeExists(root.right, key);

        return res2;
    }





    public static void main(String[] args) {
        node head = new node(4);
        head.left=new node(6);
        head.right =new node(8);
        head.left.left = new node(5);
        head.left.right = new node(2);
        head.right.left = new node(9);
        head.right.right = new node(1);
        head.left.left.left = new node(3);


        // preorder(head);
        // System.out.println();
        // inorder(head);
        // System.out.println();
        // postorder(head);

        // levelOrder(head);

        // System.out.println(sumAtKthLevel(head, 1));

        // System.out.println(hightOfTree(head));

        // System.out.println(sumOfAllNodes(head));

        // leftView(head);

        // rightView(head);

        // System.out.println(TotalNodes(head));

        // System.out.println(diameterOfTree(head));

        // preorder(head);

        // System.out.println();

        // sumReplaced(head);

        // preorder(head);


        // System.out.println(searchNode(head, 7

        System.out.println(ifNodeExists(head, 7));
    }
}