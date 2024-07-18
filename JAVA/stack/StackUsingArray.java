public class StackUsingArray {
    static class stack{
        static int arr[];
        static int size;
        static int rear;

        stack(int val){
            arr=new int[val];
            size=val;
            rear=-1;
        }

        public boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
        }

        public void push(int val){
            if(rear==size-1){
                System.out.println("stack is full");
                return;
            }
            rear++;
            for(int i=rear;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=val;
        }

        public  int pop(){
            if(rear==-1){
                return -1;
            }

            int top = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return top;
        }

        public  int peak(){
            if(rear==-1){
                return -1;
            }

            int top = arr[0];
            return top;
        }
    }

    public static void main(String[] args) {
        stack a = new stack(10);

        a.push(0);
        a.push(1);
        a.push(2);
        a.push(3);

        while (!a.isEmpty()) {
            System.out.println(a.peak());
            a.pop();
        }


    }
}
