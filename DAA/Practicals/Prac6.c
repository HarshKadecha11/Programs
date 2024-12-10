#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void quicksort(int* arr[] , int p , int r) ; 
int partition(int* arr[] , int p , int r) ; 
void swap(int *a, int *b) {
    int temp = *a; 
    *a = *b;      
    *b = temp;     
}

int main() {
    int size ; 
    printf("Enter the size of array : ") ; 
    scanf("%d" , &size) ; 
    int arr[size] ; 
    for(int i = 0 ; i<size ; i++) {
        arr[i] = random() % size ; 
    }

    clock_t start , end ; 
    double cpu_time ; 
    int p = 0 ; 
    int r = size - 1 ; 

    start = clock() ; 
    quicksort(arr , p , r) ; 
    end = clock() ; 

    cpu_time = ((double)(end-start)) / CLOCKS_PER_SEC ; 
    printf("Quick sort takes %.5f to execute ........\n" , cpu_time) ; 
}

void quicksort(int* arr[] , int p , int r) {
    if(p<r){
        int q = partition(arr,p,r) ; 
        quicksort(arr , p , q-1) ;
        quicksort(arr , q+1 , r) ;
    }
}
int partition(int* arr[] , int p , int r){
    int pivot = arr[r] ; 
    int i = p-1 ; 
    for(int j=p ; j<r ; j++ ){
        if(arr[j]<=pivot) {
            i++ ; 
            swap(arr[i] , arr[j]) ; 
        }
    }
    arr[i+1] = arr[r] ; 
    return (i+1) ; 
}