public class BST {
    
    static class node{
        int data;
        node left;
        node right;
        public
        node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }

    public static node insertInBST(node root,int val){
        if(root == null){

            return new node(val);

            
        }

        if(root.data>val){
            root.left=insertInBST(root.left, val);
        }else{
            root.right=insertInBST(root.right,val);
        }
        return root;
    }



    public static boolean searchInBST(node root, int key){

        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data >key){
            return searchInBST(root.left, key);
        }

        return searchInBST(root.right, key);
    }


    public static node inOrderSuccser(node root){
        node curr=root;

        while((curr!=null )&& (curr.left != null)){
            curr=curr.left;
        }
        return curr;
    }


    public static node deleteInBST(node root,int key){
        if(root.data>key){
            root.left=deleteInBST(root.left, key);
        }
        else if(root.data<key){
            root.right=deleteInBST(root.right, key);
        }
        else{
            if(root.left==null){
                node temp = root.right;
                root=null;
                return temp;
            }
            else if (root.right==null){
                node temp = root.left;
                root=null;
                return temp;
            }else{
                node temp = inOrderSuccser(root.right);
                root.data=temp.data;
                root.right=deleteInBST(root.right, temp.data);
            }
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


    // public static boolean isBST(node root, node min, node max){
    //     if(root == null){
    //         return true;
    //     }

    //     if(min != null && root.data <= min.data ){
    //         return false;
    //     }
    //     if(max != null && root.data>= max.data){
    //         return false;
    //     }

    //     boolean leftValid = isBST(root.left, min, root);
    //     boolean rightValid= isBST(root.right, root, max);
    //     return leftValid & rightValid;
    // }


    public static void main(String args[]){

        // node root = null;
        // root = insertInBST(root, 5);
        // insertInBST(root, 1);
        // insertInBST(root, 3);
        // insertInBST(root, 4);
        // insertInBST(root, 2);
        // insertInBST(root, 7);

        // inorder(root);
        // System.out.println();
        // if(searchInBST(root, 9)==true){
        //     System.out.println("key exist");
        // }else{
        //     System.out.println("key does not exist");
        // }
        // System.out.println();
        // root=deleteInBST(root, 3);
        // inorder(root);

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);

        if(isBST(root, null, null)){
            System.out.println("valid bst");
        }else{
            System.out.println("not valid bst");
        }

    }

}
