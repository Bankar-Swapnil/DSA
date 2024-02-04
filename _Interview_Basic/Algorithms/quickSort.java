public class quickSort {
    public static int partition(int arr[],int l,int h){

        int pivot =arr[h];
        int i=l-1;

        for(int j=l;j<h;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;

        return i+1;

    }


    public static void quickSort2(int arr[],int l,int h){
        if(l<h){
            int partitionIndex=partition(arr, l, h);
            quickSort2(arr, l, partitionIndex-1);
            quickSort2(arr,partitionIndex+1,h);

        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,7,2,1,4,3};
        quickSort2(arr,0,arr.length-1);
        display(arr);
    }
}

