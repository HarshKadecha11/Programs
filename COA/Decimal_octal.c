#include<stdio.h>

void decimalTooctal(int n) {
    int arr[32] ; 

    if(n==0) {
        printf("0") ; 
        return ; 
    }
    int i = 0 ;
    while(n>0){
        arr[i] = n % 8 ;
        n = n / 8 ; 
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

    printf("Equivalent Octal Number : ");
    decimalTooctal(num) ; 
    return 0 ; 
}