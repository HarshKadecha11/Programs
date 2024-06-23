import java.util.Scanner ;

public class Prac1_3 {
    public static void main(String[] args) {
        int n0 = 0 ; 
        int n1 = 1 ; 
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the number of terms : ");
        int n = sc.nextInt() ; 
        System.out.println("Fibonacci Series : ");
        System.out.print(n0 + " ");
        System.out.print(n1 + " ");
        int n2 ; 
        for(int i=0 ; i<n ; i++) {
            n2 = n0 + n1 ; 
            System.out.print(n2 + " ");
            n0 = n1 ; 
            n1 = n2 ; 
        }
    }
}
