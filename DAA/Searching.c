#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void linear_search(int* arr , int key , int size) ; 
int binary_search(int* arr , int key , int size) ;

int main(){
    int size ; 
    printf("Enter the Size of array : ");
    scanf("%d" , &size) ; 
    int* arr = (int*)malloc(size * sizeof(int)) ;  
    printf("\nEnter elements: ") ; 
    for(int i=0 ; i<size ; i++){
        printf("Enter ...");
        scanf("%d" , &arr[i]) ; 
    }

    for(int i=0 ; i<size ; i++){
        printf("%d\t" , arr[i]) ; 
    }

    int key ; 
    printf("\nEnter the element you want to search : ");
    scanf("%d" , &key) ; 


    clock_t start ,end; 
    double time_used ; 

    start = clock() ;
    linear_search(arr , key , size) ;  
    end = clock() ; 

    time_used = ((double)(end - start)) / CLOCKS_PER_SEC ; 
    printf("\nTime used for binary search is %f " , time_used) ; 

    clock_t start1 ,end1; 
    double time_used1 ;
    start1 = clock();
    int result = binary_search(arr, key, size);
    end1 = clock();
    time_used1 = ((double)(end1 - start1)) / CLOCKS_PER_SEC;
    if (result != -1) {
        printf("\nElement found at index %d\n", result);
    } else {
        printf("\nElement not found\n");
    }
    printf("Time used for binary search is %f seconds\n", time_used1);

    free(arr);
    return 0;


}

void linear_search(int* arr , int key , int size){
    for(int i=0 ; i<size ; i++){
        if(arr[i] == key){
            printf("\nElement found at index %d\n" , i);
        }
    }
}



