import java.util.LinkedList;
import java.util.Queue;

class buildTree{
    static class node {
        int data;
        node left;
        node right;

        node(int val){
            this.data=val;
            this.left = null;
            this.right = null;
        }
    }

    static class tree{
        static int idx = -1;
        public static node buildee(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            node newNode = new node(nodes[idx]);
            newNode.left = buildee(nodes);
            newNode.right = buildee(nodes);

            return newNode;
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
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void inOrder(node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        
        public static void levelOrder(node root ){
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
                    }
                    if (curr.right!=null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int hightTree(node root){
            if(root==null){
                return 0;
            }

            return Math.max(hightTree(root.left),hightTree(root.right))+1;
        }


        public int sumCount(node root){
            if(root==null){
                return 0;
            }

            return sumCount(root.left)+sumCount(root.right)+root.data;
        }


        public static int numberOfNodes(node root){
            if(root==null){
                return 0;
            }
            return numberOfNodes(root.left)+numberOfNodes(root.right)+1;
        }



        public static int diameterOfTree(node root){
            if(root==null){
                return 0;
            }
            int leftd=diameterOfTree(root.left);
            int lefth=hightTree(root.left);
            int rightd=diameterOfTree(root.right);
            int righth=hightTree(root.right);

            int selfd=lefth+righth+1;

            return Math.max(selfd,Math.max(leftd,rightd));

        }

    }



    public static void main(String[] args) {
        tree a = new tree();
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // node root = a.buildee( nodes);

        // System.out.println(root.data);
        // a.preOrder(root);

        // a.levelOrder(root);

        // System.out.println(a.hightTree(root));
        // System.out.println(a.sumCount(root));
        // System.out.println(a.numberOfNodes(root));
        // System.out.println(a.diameterOfTree(root));

    }
}