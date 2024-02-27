import java.util.*;

public class sorting {

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


    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp =arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,5,6,3,8,4,0,2};
        // bubbleSort(arr);
        selectionSort(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
