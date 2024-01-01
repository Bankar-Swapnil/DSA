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


    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static void levelOrder(node root){
        if(root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }

    public static int hight(node root){
        if(root==null){
            return 0;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);

        return Math.max(lh,rh)+1;
        
    }

    public static int sum(node root){
        if(root==null){
            return 0;
        }

        int ls=sum(root.left);
        int rs = sum(root.right);

        return ls+rs+root.data;
    }

    public static int count(node root){
        if(root==null){
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return lc+rc+1;
    }


    public static int diameter(node root){
        if(root==null){
            return 0;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int selfD=lh+rh+1;

        return Math.max(selfD,Math.max(ld,rd));
    }


    public static void sumReplac(node head){
        if(head==null){
            return;
        }
        
        sumReplac(head.left);
        sumReplac(head.right);

        if(head.left!=null){
            head.data+=head.left.data;
        }
        if(head.right!=null){
            head.data+=head.right.data;
        }
    }


    public static void leftView(node root){
        if(root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();

            for(int i=0;i<s;i++){
                node curr = q.remove();
                if(i==s-1){
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


    public static void rightView(node root){
        if(root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            int n = q.size();

            for(int i=1;i<=n;i++){
                node curr = q.remove();
                if(i==1){
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



    //**************top view **********

    static class info{
        node node;
        int hd ;

        info(node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }


    public static void topView(node root){
        if(root==null){
            return;
        }
        Queue<info> q = new LinkedList<>();
        HashMap<Integer,node> map = new HashMap<>();

        int min =0;
        int max =0;

        q.add(new info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left!=null){
                    q.add(new info(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right, curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }


    //******************* isBalanced *******************************/
    public static boolean isBalanced(node root){
        if(root==null){
            return true;
        }
        if(!isBalanced(root.left)){
            return false;
        }
        if(!isBalanced(root.right)){
            return false;
        }

        int lh = hight(root.left);
        int rh = hight(root.right);

        if(Math.abs(lh-rh)<=1){
            return true;
        }else{
            return false;
        }
    }


    public static void kthLevel(node root,int lv){
        if(root==null){
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level =0;

        while(!q.isEmpty()){
            node curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level++;
                }
            }else{
                if(lv==level){
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



    
    public static void main(String[] args) {
        
        node root = new node(10);
        root.left=new node(8);
        root.right = new node(16);
        root.left.left = new node(5);
        root.left.right = new node(7);

        root.right.left = new node(13);
        root.right.right = new node(19);

        /*
            *          10
            *       /       \
            *      8          16
            *   /      \   /      \
              5        7   13       19
         */

        // inorder(root);

        // levelOrder(root);
        // System.out.println(hight(root));

        // System.out.println(sum(root));
        // System.out.println(count(root));

        // System.out.println(diameter(root));

        // preOrder(root);
        // System.out.println();
        // sumReplac(root);

//         preOrder(root);
// System.out.println();
//         leftView(root);

//         System.out.println();
//         rightView(root);


        // inorder(root);
        // System.out.println();
        // topView(root);

        // System.out.println(isBalanced(root));


        kthLevel(root,1);



    }
}