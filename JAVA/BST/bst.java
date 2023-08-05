import java.util.*;

public class bst {
    
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

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean searchNode(node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data<key){
            return searchNode(root.right, key);
        }
        else{
            return searchNode(root.left, key);
        }

    }

    public static node deleteNode(node root,int val){
        if(root.data <val){
            root.right = deleteNode(root.right, val);
        }else if(root.data > val){
            root.left = deleteNode(root.left, val);
        }else{
            if(root.left == null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
        
            node inorderSuccesser=findInorderSuccesser(root.right);
            root.data = inorderSuccesser.data;
            root.right = deleteNode(root.right, inorderSuccesser.data);
        }
        return root;
    }

    public static node findInorderSuccesser(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printInRange(node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> Path){
        for(int i=0;i<Path.size();i++){
            System.out.print(Path.get(i)+"->");
        }
        System.out.println("Null");
    }


    public static void printRoot2LeafPath(node root,ArrayList<Integer> Path){
        if(root==null){
            return;
        }
        Path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(Path);
        }
        printRoot2LeafPath(root.left,Path);
        printRoot2LeafPath(root.right, Path);
        Path.remove(Path.size()-1);


    }


    public static Boolean isBst(node root, node min,node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }

        return isBst(root.left, min, root)&& isBst(root.right, root, max);
    }

    public static node mirror(node root){
        if(root==null){
            return null;
        }

        node leftMirror = mirror(root.left);
        node rightMirror = mirror(root.right);

        root.right = leftMirror;
        root.left = rightMirror;

        return root;
    }

    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static node CraeteBst(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        node root = new node(arr[mid]);
        root.left=CraeteBst(arr, st, mid-1);
        root.right = CraeteBst(arr, mid+1, end);

        return root;
    }

    public static void main(String Args[] ){
        int arr[] = {8,5,3,6,10,11,14};
        node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }
        // inorder(root);
        // System.out.println();
        // System.out.println(searchNode(root, 0));
        // deleteNode(root, 2);
        // printInRange(root,1,6);
        // inorder(root);

        // printRoot2LeafPath(root,new ArrayList<>());

        // if(isBst(root, null, null)){
        //     System.out.println("valis BST");
        // }else{
        //     System.out.println("Not Valid BST");
        // }

        // preOrder(root);
        // System.out.println();
        // root=mirror(root);
        // preOrder(root);

        int arr2[]={3,5,6,8,9,10,11,12};
        node root2=CraeteBst(arr2, 0, arr.length-1);
        preOrder(root2);

    }
}
