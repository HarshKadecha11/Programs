#include<stdio.h>

void deciTohex(int n) {
    char arr[32] ; 
    int i = 0 ; 
    while(n!=0) {
        int temp = 0 ; 
        temp = n % 16 ; 

        if(temp<10) {
            arr[i] = temp + 48 ; 
        
        }else{
            arr[i] = temp + 55 ; 
            
        }

        n = n / 16 ;
        i++; 
    }

    for(int j=i-1 ; j>=0 ; j--){
        printf("%c" , arr[j]) ; 
    }
}

int main() {
    int num ; 
    printf("Enter a Decimal number: ") ; 
    scanf("%d" , &num) ; 

    printf("Equivalent Hexadecimal number : 0x");
    deciTohex(num) ; 
    printf("\n") ; 
    return 0 ;
}