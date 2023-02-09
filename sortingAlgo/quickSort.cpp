#include<iostream>
using namespace std;

void swap(int arr[],int i, int j){
    int temp =arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

int partition(int arr[],int low, int high){

    int pivot = arr[high];
    int i = low-1;
    for (int j = low; j < high; j++)
    {
        if(arr[j]<pivot){
            i++;
            swap(arr,i,j);
        }
    }
    swap(arr,i+1,high);
    
    return i+1;

}

void quickSort(int arr[],int low,int high){
    int pivotIndex;
    if(low<high){
         pivotIndex=partition(arr,low,high);
        quickSort(arr,low,pivotIndex-1);
        quickSort(arr,pivotIndex+1,high);
    }
}

int main(){
    int arr[]={5,4,3,5,3,2,1};
    int n=7;
    for (int i = 0; i < n; i++)
    {
       cout<<arr[i]<<" ";
    }
    cout<<endl;
    quickSort(arr,0,n-1);

    for (int i = 0; i < n; i++)
    {
       cout<<arr[i]<<" ";
    }
    return 0;
}