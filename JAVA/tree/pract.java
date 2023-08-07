import java.util.*;
public class pract {
    
    static class node{
        int data;
        node left;
        node right;

        node(int val){
            this.data = val;
            this.left=null;
            this.right=null;
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
        preorder(head.left);
        System.out.print(head.data+" ");
        preorder(head.right);
    }

    public static void postorder(node head){
        if(head==null){
            return;
        }
        preorder(head.left);
        preorder(head.right);
        System.out.print(head.data+" ");
    }

    public static void levelOrder(node head){
        if(head==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(head);
        q.add(null);

        while(!q.isEmpty()){
            node curr = q.remove();

            if(curr!=null){
                System.out.print(curr.data+" ");
                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }else if(!q.isEmpty()){
                System.out.println();
                q.add(null);
            }
            
        }
    }

    public static int hight(node head){
        if(head==null){
            return 0;
        }

        int lHight=hight(head.left);
        int rHight =  hight(head.right);
        return lHight+rHight+1;
    }

    public static int sumOfNodes(node head){
        if(head==null){
            return 0;
        }
        int lSum=sumOfNodes(head.left);
        int rSum = sumOfNodes(head.right);

        return lSum+rSum+head.data;
    }

    public static int totalNumberOfNodes(node head){
        if(head==null){
            return 0;
        }

        int lNodesSum = totalNumberOfNodes(head.left);
        int rNodesSum = totalNumberOfNodes(head.right);

        return lNodesSum+rNodesSum+1;
    }

    public static int diameter(node head){
        if(head==null){
            return 0;
        }

        int lDiameter=diameter(head.left);
        int lHight=hight(head.left);

        int rDiameter = diameter(head.right);
        int rHight = hight(head.right);

        int selfDiameter = lHight+rHight+1;

        return Math.max(selfDiameter,Math.max(rDiameter, lDiameter));

    }

    public static void rightView1(node head){
        if(head==null){
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(head);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0;i<n;i++){
                node curr=q.peek();
                q.remove();
                if(i==n-1){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }


    public static void leftView1(node head){
        if(head==null){
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(head);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=0;i<n;i++){
                node curr=q.peek();
                q.remove();
                if(i==0){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void sumReplaced(node head){
        if(head==null){
            return;
        }
        sumReplaced(head.left);
        sumReplaced(head.right);
        if(head.left!=null){
            head.data+=head.left.data;
        }
        if(head.right!=null){
            head.data+=head.right.data;
        }
    }


    public static Boolean isBalanced(node head){
        if(head==null){
            return true;
        }

        if(isBalanced(head.left)==false){
            return false;
        }
        if(isBalanced(head.right)==false){
            return false;
        }

        int lh = hight(head.left);
        int rh = hight(head.right);

        if(Math.abs(lh-rh)<=1){
            return true;
        }else{
            return false;
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
        // System.out.println();
        // postorder(head);
        // System.out.println();
        // inorder(head);
        // System.out.println();
        // System.out.println();
        // levelOrder(head);

        System.out.println(sumOfNodes(head));
        System.out.println(totalNumberOfNodes(head));
        System.out.println(diameter(head));
        rightView1(head);
        leftView1(head);
        preorder(head);
        sumReplaced(head);
        System.out.println();
        preorder(head);
        System.out.println(isBalanced(head));

    }
}
