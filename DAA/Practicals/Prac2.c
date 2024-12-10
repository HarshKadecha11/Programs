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
int main(){
    int size ; 
    printf("Enter the size of array : ") ; 
    scanf("%d" , &size) ; 
    int arr[size] ; 
    for(int i = 0 ; i<size ; i++) {
        arr[i] = random() % size ; 
    }
    clock_t start,end ; 
    double cpu_time ; 
    start = clock() ; 
    selection(arr , size) ; 
    end = clock() ; 
    cpu_time = ((double)(end-start)) / CLOCKS_PER_SEC ;
    printf("Selection Sort takes %.5f to exceute ...." , cpu_time) ;  
    // printf("Your sorted array is : ......\n") ; 
    // for(int i=0 ; i<size ; i++) {
    //     printf("%d\t" , arr[i]) ; 
    // }
}