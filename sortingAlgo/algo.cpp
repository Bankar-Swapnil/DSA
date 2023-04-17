#include<iostream>
using namespace std;

void printArray(int arr[],int n){
    cout<<"Array is: ";
    for(int i=0;i<n;i++){
        
       cout<< arr[i]<<" ";
    }
}

void bubbleSort(int arr[],int n){
    int temp;
    int isSorted =0;
    for(int i=0;i<n-1;i++){
        cout<<"number of passes : "<<i<<endl;
        isSorted =1;
        for(int j=0;j<n-i-1;j++){
            
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isSorted =0;
            }
        }
        if(isSorted){
            printArray(arr,n);
            return;
        }
    }
    printArray(arr,n);

}


void insertionSort(int arr[],int n){
    int key,j;
    for(int i=1;i<=n-1;i++){
        key=arr[i];
        j=i-1;
        while (j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    printArray(arr,n);
}

void selectionSort(int arr[],int n){
    int indexOfMin,temp;

    for(int i=0;i<n;i++){
        indexOfMin=i;
        
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[indexOfMin]){
                indexOfMin=j;
            }
        }
        temp = arr[i];
        arr[i]= arr[indexOfMin];
        arr[indexOfMin] = temp;

    }
    printArray(arr,n);
}


int partition(int arr[],int low ,int high){
    int pivot = arr[low];
    int i = low+1;
    int j = high;
    int temp;

    do{
        while(arr[i]<=pivot){
            i++;
        }
        while(arr[j]>pivot){
            j--;
        }
        if(i<j){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
    }while(i<j);

    temp = arr[low];
    arr[low] = arr[j];
    arr[j]= temp;
    return j;
}

void quickSort(int arr[],int low,int high){
    int partitionIndex ;
    if (low < high)
    {
        partitionIndex = partition(arr, low, high); 
        quickSort(arr, low, partitionIndex - 1);  
        quickSort(arr, partitionIndex + 1, high); 
    }
    
}

int main(){
    int n;
    cout<<"Enter the size of array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the Elements of array"<<endl;
    for(int i=0;i<n;i++){
       cin>> arr[i];
    }

    // bubbleSort(arr,n);
    // insertionSort(arr,n);
    // selectionSort(arr,n);
    printArray(arr,n);
    quickSort(arr,0,n-1);
    printArray(arr,n);

    return 0;
}