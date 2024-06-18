import java.io.* ; 


public class CopyFile  {
    public static void main(String[] args) throws Exception {
        int i ; 
        FileInputStream fin ; 
        FileOutputStream fout ;
        fin = new FileInputStream(args[0]) ; 
        fout = new FileOutputStream(args[1]) ;

        do {
            i = fin.read() ;
            if (i != -1) fout.write(i) ;
        } while (i != -1) ;
    }

}

