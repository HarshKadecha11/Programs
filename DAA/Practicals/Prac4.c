#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void swap(int *a, int *b) {
    int temp = *a; 
    *a = *b;      
    *b = temp;     
}
void selection(int* arr , int size){
    for(int i=0 ; i<size-1 ; i++){
        int smallest = i ;
        for(int j=i+1 ; j<size ; j++){
            if(arr[j] < arr[smallest]){
                smallest = j ; 
            }
        }
        swap(&arr[i] , &arr[smallest]) ; 
    }
}

void seq_search(int* arr , int size){
    printf("Enter the element you want to search : ") ; 
    int num ; 
    scanf("%d" , &num ) ; 
    int flag = 0 ; 
    for(int j = 0 ; j<size ; j++) {
        
        if(arr[j] == num ){
            flag = 1 ; 
            printf("%d is found at %d index\n " , num , j );
            break ; 
        }
    }
    if(flag == 0) {
        printf("Element not found ....\n") ; 
    }
}

int bin_search(int* arr , int low , int high , int element) {
    if(low>high) {
        return -1 ;  
    }

    int mid = low + (high-low)/2 ; 

    if(arr[mid] == element) {
        return mid ;  
    }else if(arr[mid] > element) {
        return bin_search(arr , low , mid-1 , element) ; 
    }else{
        return bin_search(arr , mid+1 , high , element) ; 
    }
}



int main() {
    int size ; 
    printf("Enter the size of array : ") ; 
    scanf("%d" , &size) ; 
    int arr[size] ; 
    for(int i = 0 ; i<size ; i++){
        arr[i] = random() % size ; 
    }


    clock_t s1,e1,s2,e2; 
    double t1,t2 ; 

    s1 = clock() ; 
    // seq_search(arr , size) ; 
    e1 = clock() ; 
    t1 = ((double)(e1-s1)) / CLOCKS_PER_SEC ; 
    // printf("Sequential Search takes %.5f seconds to execute ......" , t1) ;

    selection(arr , size) ; 
    int low = 0 ; 
    int high = size - 1 ; 
    s2 = clock() ; 
    int element ; 
    printf("Enter the element you want to search : ") ; 
    scanf("%d" , &element) ; 
    int result = bin_search(arr , low , high , element) ; 
    printf("%d is found at %d\n" , element , result) ; 
    e2 = clock() ; 
    t2 = ((double)(e2-s2)) / CLOCKS_PER_SEC ; 
    printf("Binary Search takes %.5f seconds to execute ......\n" , t2) ;
}