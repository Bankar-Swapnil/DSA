import java.util.ArrayList;

public class bst {
    static class node{
        int data;
        node left;
        node right;

        node(int val){
            this.data = val;
            // this.left = null;
            // this.right =null;
        }
    }

    public static node insertInBST(node root,int val){

        if(root==null){
            root = new node(val);
            return root;
        }

        if(root.data>val){
            root.left = insertInBST(root.left, val);
        }else{
            root.right = insertInBST(root.right, val);
        }

        return root;
    }


    public static void inOrder(node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


    public static boolean searchInBST(node root,int val){
        if(root==null){
            return false;
        }

        if(root.data>val){
            return searchInBST(root.left,val);
        }
        if(root.data<val){
            return searchInBST(root.right, val);
        }else{
            if(root.data==val){
                return true;
            }
        }

        return false;
    }



    public static node deleteInBST(node root,int val){

        if(root.data>val){
            root.left = deleteInBST(root.left,val);
            return root;
        }
        if(root.data<val){
            root.right = deleteInBST(root.right, val);
            return root;
        }
        else{

            // case1

            if(root.left==null && root.right==null){
                return null;
            }

            //case2

            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //case3

            node is = findInorderSucc(root.right);
            root.data = is.data;
            root.right=deleteInBST(root.right, is.data);
        }
        return root;
    }

    public static node findInorderSucc(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }





    public static void printInRange(node root,int k,int l){
        if(root==null){
            return;
        }
        if(root.data>=k && root.data<=l){
            printInRange(root.left, k, l);
            System.out.print(root.data+" ");
            printInRange(root.right, k, l);
        }else if(root.data <k){
            printInRange(root.left, k, l);
        }else{
            printInRange(root.right, k, l);
        }
    }


    public static void inOrder2(node root){

        ArrayList<Integer> arr = new ArrayList<>();
        int flag =0;

        if(root==null){
            if(arr.size()!=0){
                
                for(int i=0;i<arr.size();i++){
                    if(arr.get(i)>arr.get(i+1)){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("not valid bst");
                }else{
                    System.out
                    .println(" valid bst");
                }
            }

            return;
        }

        inOrder(root.left);
        arr.add(root.data);
        inOrder(root.right);

    }


    public static void main(String[] args) {
        
        int arr[]= {5,4,8,7,2,9,1};

        node root =null;

        for(int i=0;i<arr.length;i++){
            root=insertInBST(root,arr[i]);
        }

        // inOrder(root);
        // System.out.println();

        // System.out.println(searchInBST(root, 1));

        // deleteInBST(root, 4);

        // inOrder(root);



        // printInRange(root, 2, 7);

        inOrder2(root);
    }
}
