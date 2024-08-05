#include<stdio.h>
#ifndef Harsh 
#define Harsh

void decimalTobinary(int n) {
    int arr[32] ; 

    if(n==0) {
        printf("0") ; 
        return ; 
    }
    int i = 0 ;
    while(n>0){
        arr[i] = n % 2 ;
        n = n / 2 ; 
        i++ ; 
    }

    for(int j = i - 1 ; j>=0 ; j--){
        printf("%d" , arr[j]) ;
    }
    printf("\n"); 
}

int main() {
    int num ; 
    printf("Enter a Decimal number: ") ; 
    scanf("%d" , &num) ; 

    printf("Equivalent Binary : ");
    decimalTobinary(num) ; 
    return 0 ; 
}
#endif