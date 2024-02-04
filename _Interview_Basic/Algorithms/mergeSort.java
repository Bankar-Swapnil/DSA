public class mergeSort {
    


    public static void mergeSorted(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSorted(arr,si,mid);
        mergeSorted(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid ,int ei){
        int i = si;
        int j=mid+1;
        int k=0;
        int temp[]= new int[ei-si+1];

        while (i<=mid && j<=ei) {
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];  
        }


        for(k=0,i=si;k<temp.length;k++,i++ ){
            arr[i]=temp[k];  //copying the sorted elements back to original array
        }

    }


    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,7,2,1,4,3};
        mergeSorted(arr,0,arr.length-1);
        display(arr);
    }
}

