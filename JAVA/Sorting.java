public class Sorting {


    public  static void selectionSort(int arr[]){

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

    public static void bubbleSort(int arr[]){

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


    public static void insertationSort(int arr[]){

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


    public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1); // index of smaller element
		for (int j=low; j<high; j++)
		{
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot)
			{
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}


    public static void quickSort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}



    public static void merge(int arr[],int l,int mid,int r){

        int n=mid-l+1;
        int m = r-mid;

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0;i<n;i++){
            a[i]=arr[l+i];
        }
        for(int i=0;i<m;i++){
            b[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n){
                arr[k]=a[i];
                i++;
                k++;
        }
        while(j<m){
                arr[k]=b[j];
                j++;
                k++;
        }

    }



    public static  void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }



    public static void merge2(int arr[],int l ,int mid,int h){

        int n =mid-l+1;
        int m = h-mid;

        int a[]= new int[n];
        int b[]= new int[m];

        for(int i=0;i<n;i++){
            a[i]=arr[l+i];
        }
        for(int j=0;j<m;j++){
            b[j]=arr[mid+1+j];
        }

        int i=0;
        int j =0;
        int k=l;

        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n){
            arr[k]=a[i];
            i++;
            k++;
        }

        while(j<m){
            arr[k]=b[j];
            j++;
            k++;
        }


        

    }

    public static void  mergeSort2(int arr[],int l,int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort2(arr, l, mid);
            mergeSort2(arr, mid+1,h);

            merge2(arr,l,mid,h);

        }
    }



    public static int partition2(int arr[],int l,int h){

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
            int partitionIndex=partition2(arr, l, h);
            quickSort2(arr, l, partitionIndex-1);
            quickSort2(arr,partitionIndex+1,h);

        }
    }

    
    

    public static void selectionSort2(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

public static void bubbleSort2(int arr[]){
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

    public static void insertationSort2(int arr[]){
        
    }


    public static void main(String args[]){

        int arr[]={10,3,7,4,9,1};
        // selectionSort(arr);
        // selectionSort2(arr);
        // bubbleSort(arr);
        // bubbleSort(arr);
        // bubbleSort2(arr);
        // quickSort(arr,0,arr.length-1);
        // mergeSort(arr,0,5);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}
