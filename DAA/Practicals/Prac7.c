#include<stdio.h>
#include<stdlib.h>


void makingchange(int amount , int denominations[] , int size) {
    int count[size] ; 
    for(int i=0 ; i<size ; i++) {
        count[i] = 0 ; 
    }

    for(int i=0 ; i<size ; i++) {
        while(amount >= denominations[i]){
            amount -= denominations[i] ; 
            count[i] ++ ; 
        }
    }
    printf("Change can be made using the following denominations:\n");
    for (int i = 0; i < size; i++) {
        if (count[i] > 0) {
            printf("%d coins of  %d\n", count[i], denominations[i]);
        }
    }
}

int main() {
    int amount  ; 
    printf("Enter the amount of change : " ) ; 
    scanf("%d" , &amount) ; 

    int denominations[] = {25,10,5,1} ; 
    int size = sizeof(denominations) / sizeof(denominations[0]) ;

    makingchange(amount , denominations , size) ; 
    return 0 ;  
}