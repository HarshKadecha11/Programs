#include<stdio.h>
#include<string.h>
#include<math.h>

void leftshift(char binary[] , int shift){
    int deci ; 
    int len = strlen(binary) ; 

    for(int i = 0 ; i<len ; i++){
        if(binary[i] == '1'){
            deci += pow(2,len-i-1) ; 
        }
    }
    deci = deci << shift ; 
    int i = 0 ; 
    char binaryB[100] ; 
    while(deci>0){
        binaryB[i] = deci % 2 ; 
        deci = deci / 2 ; 
        i = i + 1 ;
    }
    printf("Left Shift : ") ; 
    for(int j = i - 1 ; j>=0 ; j--){
        printf("%d" , binaryB[j]) ;
    }
    printf("\n");

}
void rightshift(char binary[] , int shift){
    int deci ; 
    int len = strlen(binary) ; 

    for(int i = 0 ; i<len ; i++){
        if(binary[i] == '1'){
            deci += pow(2,len-i-1) ; 
        }
    }
    deci = deci >> shift ; 
    int i = 0 ; 
    char binaryB[100] ; 
    while(deci>0){
        binaryB[i] = deci % 2 ; 
        deci = deci / 2 ; 
        i = i + 1 ;
    }
    printf("Left Shift : ") ; 
    for(int j = i - 1 ; j>=0 ; j--){
        printf("%d" , binaryB[j]) ;
    }
    printf("\n");

}
int main(){
    char binaryN[100] ; 
    printf("Enter a Binary number : ") ; 
    scanf("%s" , binaryN) ; 
    int shift ; 
    printf("From how many bits you want to shift ? ") ;
    scanf("%d" , &shift) ; 
    
    printf("\n1.Left Shift\n") ; 
    printf("2.Right Shift\n" ) ; 
    int ch ; 
    printf( "Enter your choice:") ; 
    scanf("%d" , &ch) ; 
    if(ch == 1){
        leftshift(binaryN , shift) ; 
    }
    else if(ch==2) {
        rightshift(binaryN , shift) ; 
    }else{
        printf("Enter valid choice!!!!") ; 
    } 
}

