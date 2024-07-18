public class pracSort {
    

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[minpos];
            arr[minpos]=temp;
        }
    }

    public static void insertationSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev =i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }


    public static void countSort(int arr[]){
        int len = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            len = Math.max(len, arr[i]);
        }
        int count[] = new int[len+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;  //this one
        mergeSort(arr,si,mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si ,int mid, int ei){

        int temp[] =new  int[ei-si+1]; //this one 
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k]; //this one
        }
    }


    public static void quickSort(int arr[],int si , int ei){
        if(si>=ei){
            return;
        }

        int PIndx = partition(arr,si,ei);
        quickSort(arr, si, PIndx-1);
        quickSort(arr, PIndx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){  //this one   
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[]={10,3,7,4,9,1};
            // bubbleSort(arr);
            // selectionSort(arr);
            // insertationSort(arr);
            // countSort(arr);
            // mergeSort(arr, 0, arr.length-1);
            quickSort(arr, 0, arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
