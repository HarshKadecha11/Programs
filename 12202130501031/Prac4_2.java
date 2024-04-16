abstract class Cipher{
    String text ; 
    int key ; 
    Cipher(String str , int k) {
        text = str ; 
        key = k ; 
    }w
    abstract String encryption() ; 
    abstract String decryption() ; 

}

class cCipher extends Cipher {
    cCipher(String s , int n) {
        super(s,n) ;  
    }
    String encryption() {
        char arr[] =  text.toCharArray() ; 

        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = (char) (arr[i] + key) ; 
        }
        text = new String(arr) ; 
        return text ; 

    }
    String decryption() {
        char arr[] =  text.toCharArray() ; 

        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = (char) (arr[i] - key) ; 
        }
        text = new String(arr) ; 
        return text ; 
        
    }
}
class Prac4_2{
    public static void main(String[] args) {
        cCipher ob = new cCipher("GCET",3) ; 
        System.out.println("Encrypted text is " + ob.encryption());
        System.out.println("Decrypted text is " + ob.decryption());
    }
}