#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void insertion_sort(int* arr , int size) {
    for(int j=1 ; j<size ; j++) {
        int x = arr[j] ; 
        int i = j -1 ; 
        while(x<arr[i] && i>0) {
            arr[i+1] = arr[i] ; 
            i-- ; 
        }
        arr[i+1] = x ; 
    }
}

int main() {
    int size ; 
    printf("Enter the size of the array : ") ;
    scanf("%d" , &size) ; 
    int arr[size] ;
    for(int i =0 ; i<size ; i++) {
        arr[i] = random() % size ; 
    } 
    
    clock_t start , end ; 
    double cpu_time ;
    start = clock() ; 
    insertion_sort(arr , size) ; 
    end = clock() ;
    cpu_time = ((double)(end-start)) / CLOCKS_PER_SEC ; 
    printf("Insertion Sort takes %.5f seconds to execute ......\n" , cpu_time) ;

    // printf("Your sorted array is .... \n") ; 
    // for(int i =0 ; i<size ; i++) {
    //     printf("%d\t" , arr[i]); 
    // }  
}