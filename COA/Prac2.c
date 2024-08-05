#include <stdio.h>
#include <string.h>

void onescomple(char binary[]){
    for (int i = 0 ; binary[i] != '\0' ; i++){
        if(binary[i] == '0'){
            binary[i] = '1' ; 
        }else{
            binary[i] = '0' ;
        }
    }
}

void twoscomple(char binary[]){
    onescomple(binary);
    printf("1's Complement of the given number is %s" , binary);
    printf("\n") ; 

    int carry = 1 ; 
    
    for(int j = strlen(binary)-1 ; j>=0 ; j--){
        if(binary[j] == '1' && carry==1){
            binary[j] = '0' ; 
        }else if(binary[j] == '0' && carry==1){
            binary[j] = '1' ; 
            carry = 0 ;
            break ; 
        }
    }
    printf("2's Complement of the given number is %s" , binary);
    printf("\n") ;
}

int main() {
    char binaryN[100] ; 
    printf("Enter a binary number : ") ; 
    scanf("%s" , binaryN) ; 
    twoscomple(binaryN); 
    return 0 ; 
}