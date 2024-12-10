#include<stdio.h>
#include<stdlib.h>
#include<time.h> 

void bubble(int* arr , int size) {
    for(int i=0 ; i<size-1 ; i++){
        for(int j=0 ; j<size-i-1; j++) {
            if(arr[j]>arr[j+1]){
                int temp = arr[j] ; 
                arr[j] = arr[j+1] ;
                arr[j+1] = temp ;  
            }
        }
    }
}

int main() {
    int size ; 
    printf("Enter the sie of array : ") ; 
    scanf("%d" , &size) ; 
    int arr[size] ; 
    for(int i=0 ; i<size ; i++){
        arr[i] = random() % size ;
    }
    clock_t start , end ; 
    double cpu_time ; 
    start = clock() ; 
    bubble(arr , size) ; 
    end = clock() ; 
    cpu_time = ((double)(end-start)) / CLOCKS_PER_SEC ; 
    printf("Bubble sort takes %.5f seconds to execute ..." , cpu_time) ; 
    // printf("The array is ......\n") ; 
    // for(int i=0 ; i<size ; i++) {
    //     printf("%d \t" , arr[i]) ; 
    // }
} 