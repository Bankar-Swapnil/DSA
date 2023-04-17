#include<iostream>
using namespace std;

// void swap(int arr[],int i, int j){
//     int temp =arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }

// int partition(int arr[],int low, int high){

//     int pivot = arr[high];
//     int i = low-1;
//     for (int j = low; j < high; j++)
//     {
//         if(arr[j]<pivot){
//             i++;
//             swap(arr,i,j);
//         }
//     }
//     swap(arr,i+1,high);
    
//     return i+1;

// }

// void quickSort(int arr[],int low,int high){
//     int pivotIndex;
//     if(low<high){
//          pivotIndex=partition(arr,low,high);
//         quickSort(arr,low,pivotIndex-1);
//         quickSort(arr,pivotIndex+1,high);
//     }
// }

// int main(){
//     int arr[]={5,4,3,5,3,2,1};
//     int n=7;
//     for (int i = 0; i < n; i++)
//     {
//        cout<<arr[i]<<" ";
//     }
//     cout<<endl;
//     quickSort(arr,0,n-1);

//     for (int i = 0; i < n; i++)
//     {
//        cout<<arr[i]<<" ";
//     }
//     return 0;
// }






void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout<<A[i]<<" ";
    }
    cout<<endl;
}

int partition(int A[], int low, int high)
{
    int pivot = A[low];
    int i = low + 1;
    int j = high;
    int temp;

    do
    {
        while (A[i] <= pivot)
        {
            i++;
        }

        while (A[j] > pivot)
        {
            j--;
        }

        if (i < j)
        {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    } while (i < j);

    // Swap A[low] and A[j]
    temp = A[low];
    A[low] = A[j];
    A[j] = temp;
    return j;
}

void quickSort(int A[], int low, int high)
{
    int partitionIndex; // Index of pivot after partition

    if (low < high)
    {
        partitionIndex = partition(A, low, high); 
        quickSort(A, low, partitionIndex - 1);  // sort left subarray 
        quickSort(A, partitionIndex + 1, high); // sort right subarray
    }
}

int main()
{
    int A[] = {9, 4, 4, 8, 7, 5, 6};
    int n = 9;
    n =7;
    printArray(A, n);
    quickSort(A, 0, n - 1);
    printArray(A, n);
    return 0;
}
