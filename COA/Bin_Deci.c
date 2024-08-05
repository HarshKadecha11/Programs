#include<stdio.h> 
#include<math.h> 
#include<string.h> 


void binTodeci() {
    char arr[32] ; 
    printf("Enter number in Binary : ") ; 
    scanf("%s" , &arr) ; 

    int deci = 0 ; 
    int len = strlen(arr) ; 

    for(int i = 0 ; i<len ; i++) {
        if(arr[i] == '1') {
            deci = deci + pow(2,len-i-1) ; 
        }
    }
    printf("Decimal Represention: %d" , deci) ; 

}
int main(){
    binTodeci() ; 
    printf("\n") ; 
    return 0 ; 
}