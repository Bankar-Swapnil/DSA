import java.util.*;;

public class tree {
    
    static class node{
        int data;
        node left;
        node right;

        node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        preorder(head.left);
        preorder(head.right);
    }

    public static void inorder(node head){
        if(head==null){
            return;
        }
        inorder(head.left);
        System.out.print(head.data+" ");
        inorder(head.right);
    }

    public static void postorder(node head){
        if(head==null){
            return;
        }
        postorder(head.left);
        postorder(head.right);
        System.out.print(head.data+" ");
    }


    public static void leveOrder(node head){
        if(head == null){
            return ;
        }

        Queue<node> q = new LinkedList<>();
        q.add(head);
        q.add(null);

        while(!q.isEmpty()){
            node curr = q.peek();
            q.remove();
            if(curr!=null){
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }else if(!q.isEmpty()){
                q.add( null);
            }
        }
    }


    public static int sumAtKthLevel(node head,int k){
        if(head==null){
            return -1;
        }

        Queue<node> q = new LinkedList<>();

        q.add(head);
        q.add(null);
        int level = 0;
        int sum = 0;

        while(!q.isEmpty()){

            node curr = q.peek();
            q.remove();
            if(curr!=null){
                if(level==k){
                    sum+=curr.data;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }else if(!q.isEmpty()){
                level++;
                q.add( null);
            }
        }
        return sum;
    }

    public static int totalNodes(node head){
        if(head==null){
            return 0;
        }
        return totalNodes(head.left)+totalNodes(head.right)+1;
    }

    public static int sumNode(node head){
        if(head == null){
            return 0;
        }

        return sumNode(head.left)+sumNode(head.right)+head.data;
    }

    public static int heightOfTree(node head){
        if(head == null){
            return 0;
        }

        int lHeight = heightOfTree(head.left);
        int rHeight = heightOfTree(head.right);

        return Math.max(lHeight,rHeight)+1;
    }

    public static int diameterOfTree(node head){
        if(head == null){
            return 0;
        }

        int lHeight = heightOfTree(head.left);
        int rHeight = heightOfTree(head.right);
        int currDiameter = lHeight+rHeight+1;

        int lDiameter = diameterOfTree(head.left);
        int rDiameter = diameterOfTree(head.right);
        
        return Math.max(currDiameter, Math.max(lDiameter,rDiameter));
    }

    public static void sumReplace(node head){
        if(head == null){
            return;
        }

        sumReplace(head.left);
        sumReplace(head.right);
        if(head.left != null){
            head.data+=head.left.data;
        }
        if(head.right != null){
            head.data+=head.right.data;
        }
    }

    public static boolean isBalancedTree(node head){

        if(head == null){
            return true;
        }

        if(isBalancedTree(head.left)==false){
            return false;
        }

        if(isBalancedTree(head.right)==false){
            return false;
        }

        int lHeight = heightOfTree(head.left);
        int rHeight = heightOfTree(head.right);

        if(Math.abs(lHeight-rHeight)<=1){
            return true;
        }else{
            return false;
        }
    }

    public static void rightView(node root){
        if(root == null){
            return;
        }
        
        Queue<node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0;i<n;i++){

                node curr = q.peek();
                q.remove();
                if(i==n-1){
                    System.out.print(curr.data+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
            
    }

    public static void leftView(node root){
        if(root == null){
            return;
        }
        
        Queue<node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0;i<n;i++){

                node curr = q.peek();
                q.remove();
                if(i==0){
                    System.out.print(curr.data+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
            
    }


    public static void main(String args[]) {

        node head = new node(4);
        head.left=new node(6);
        head.right =new node(8);
        head.left.left = new node(5);
        head.left.right = new node(2);
        head.right.left = new node(9);
        head.right.right = new node(1);
        head.left.left.left = new node(3);

        // preorder(head);
        // inorder(head);
        // postorder(head);
        // leveOrder(head);
        // System.out.println(sumAtKthLevel(head, 2));
        // System.out.println(sumNode(head));
        // System.out.println(totalNodes(head));

        // System.out.println(heightOfTree(head));
        // System.out.println(diameterOfTree(head));

        // preorder(head);
        // System.out.println();
        // sumReplace(head);
        // preorder(head);

        // if(isBalancedTree(head)){
        //     System.out.println("Tree is Balanced");
        // }else{
        //     System.out.println("tree is not balanced");
        // }
        
        // rightView(head);
        // System.out.println();
        // leftView(head);
        
    }
}
