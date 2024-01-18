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
    }

    public static void main(String[] args) {
        tree a = new tree();
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        node root = a.buildee( nodes);
        System.out.println(root.data);
        
    }
}