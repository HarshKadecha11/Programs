#include<stdio.h>
#include<time.h>
#include<stdlib.h>

void quicksort(int arr[] , int p , int r) ; 
int Partition(int arr[] , int p , int r) ; 
void reverseArray(int* arr, int size) ; 

int main() {
    int size ; 
    printf("Enter the size of array : ") ; 
    scanf("%d" , &size) ;
    int arr[size] ; 
    for(int i=0 ; i<size ; i++){
        arr[i] = rand() % size ; 
    }
    int p = 0 ; 
    int r = size - 1; 

    clock_t start , end ; 
    double time_used ; 

    start = clock() ; 
    quicksort(arr , p , r) ; 
    end = clock() ; 

    time_used = ((double)(end - start) )/ CLOCKS_PER_SEC ; 
    printf("\nThe total time taken for normal data is : %f " , time_used) ; 

    // printf("Sorted array: ");
    
    printf("\n");
    clock_t start2 , end2 ; 
    double time_used2 ; 
    start2 = clock() ; 
    quicksort(arr , p , r) ; 
    end2 = clock() ; 

    // time_used2 = ((double)(end2 - start2) )/ CLOCKS_PER_SEC ; 
    // printf("\nThe total time taken for sorted data is : %f " , time_used2) ; 


    // reverseArray(arr,size) ; 
    // clock_t start1 , end1 ; 
    // double time_used1 ; 

    // start1 = clock() ; 
    // quicksort(arr , p , r) ; 
    // end1 = clock() ; 

    // time_used1 = ((double)(end1 - start1) )*/ CLOCKS_PER_SEC ; 
    // printf("\nThe total time taken for reverse data is : %f " , time_used1) ; 

    
}
void quicksort(int arr[] , int p , int r) {
    if(p<r){
        int q = Partition(arr , p , r) ; 
        quicksort(arr , p , q-1) ;
        quicksort(arr , q+1 , r) ; 
    }
}

int Partition(int arr[] , int p , int r) {
    int x = arr[r] ; 
    int i = p-1 ; 
    for(int j = p ; j < r ; j++) {
        if (arr[j] <= x){
            i = i + 1 ; 
            int temp = arr[j] ; 
            arr[j] = arr[i] ;
            arr[i] = temp ; 
        }
    }
    int t = arr[i+1] ;
    arr[i+1] = arr[r] ; 
    arr[r] = t ; 
    return i+1 ; 

}

void reverseArray(int* arr, int size) {
    int start = 0;
    int end = size - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}