#include<iostream>
using namespace std;

void mereg(int arr[],int l,int mid,int r){
    //size of temp array
    int n1=mid-l+1;
    int n2 = r- mid;
    // temp array
    int a[n1];
    int b[n2];

    for(int i=0;i<n1;i++){
        a[i]=arr[l+i];
    }
    for(int j=0;j<n2;j++){
        b[j]=arr[mid+1+j];
    }

    int i=0;
    int j=0;
    int k=l;
      
    while (i<n1 && j<n2)
      {
        if(a[i]<b[j]){
            arr[k]=a[i];
            k++;
            i++;
        } 
        else{
            arr[k]=b[j];
            k++; 
            j++;
        }
    }

    while (i<n1)
    {
        arr[k]=a[i];
        k++;
        i++;   
    }
    while (j<n2)
    {
        arr[k]=b[j];
        k++;
        j++;   
    }
      

}

void mergeSort(int arr[],int l,int r){
    if(l<r){
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mereg(arr,l,mid,r);
    }
}

main(){
    int arr[]={5,4,3,2,1};
    mergeSort(arr,0,4);
    for(int i=0; i<5; i++){    
        cout<<arr[i]<<" ";
    }
    return 0;

}; 