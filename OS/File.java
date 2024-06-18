import java.io.* ; 

public class File {
    public static void main(String[] args) {
        PrintWriter p = new PrintWriter(System.out , true) ; 
        p.println("Hello World") ;
        int i = -7 ; 
        p.println(i);
        double d = 4.5e-7  ; 
        p.println(d) ;
    }
}
