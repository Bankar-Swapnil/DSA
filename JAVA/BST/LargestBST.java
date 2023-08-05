import java.util.*;

public class LargestBST {
    public static class node{
        int data;
        node left;
        node right;
        public node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root,int val){
        if(root==null){
            root = new node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        if(root.data<val){
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static class info{
        int size;
        int min;
        int max;
        boolean isBST;

        public info(int size,int min,int max,boolean isBST){
            this.isBST=isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static int maxBST=0;

    public static info largeBst(node root){
        if(root==null){
            return new info(0,Integer.MAX_VALUE,Integer.MIN_VALUE,true);
        }

        info left = largeBst(root.left);
        info right = largeBst(root.right);

        int size = left.size+right.size+1;
        int min = Math.min(root.data,Math.min(left.min,right.min));
        int max = Math.max(root.data,Math.max(left.max,right.max));

        if(root.data<=left.max || root.data >=right.min){
            return new info(size, min, max, false);
        }

        if(left.isBST&& right.isBST){
            maxBST=Math.max(maxBST, size);
            return new info(size, min, max, true);
        }
            
        return new info(size, min, max, false);
    }

    public static void main(String Args[] ){
        int arr[] = {8,5,3,6,10,11,14};
        node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }

        info in = largeBst(root);
        System.out.println(maxBST);
    }

}
