public class sort {

    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void insertationSort(int arr[]) {

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j]=arr[j+1];
                j--;
            }

            arr[j+1]=key;

        }  
    }

    public static int partition(int arr[],int l,int h) {
        int pivot=arr[h];
        int i=l-1;

        for(int j=l;j<h;j++){

            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
            }
        }

        int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;

		return i+1;
    }

    public static void quickSort(int arr[],int l,int h) {
        if(l<h){
            int pi = partition(arr,l,h);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, h);
        }
    }

    public static void main(String args[]) {
        int arr[]={10,3,7,4,9,1};

        // selectionSort(arr);
        // bubbleSort(arr);
        quickSort(arr,0,arr.length-1);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
