public class queueUsingArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;

        }

        public void push(int val){
            if(rear==size-1){
                return;
            }
            rear++;
            arr[rear]=val;

        }

        public  int pop(){
            if(rear==-1){
                return -1;
            }
            int val = arr[0];

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return val;
        }

        public  int peak(){
            if(rear==-1){
                return -1;
            }
            int val = arr[0];
            return val;
        }
    }

    public static void main(String[] args) {
         queue a = new queue(10);

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
