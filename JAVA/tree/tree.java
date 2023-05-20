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

    public static void main(String args[]) {
        node head = new node(4);
        head.left=new node(6);
        head.right =new node(8);
        head.left.left = new node(5);
        head.left.right = new node(2);
        head.right.left = new node(9);
        head.right.right = new node(1);

        // preorder(head);
        // inorder(head);
        // postorder(head);
        // leveOrder(head);
        // System.out.println(sumAtKthLevel(head, 2));
        
    }
}
