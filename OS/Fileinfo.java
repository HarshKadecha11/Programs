import java.io.File ; 
public class Fileinfo {
    public static void main(String[] args) {
        File f = new File("Documents\\Work\\newfile.txt") ;
        if(f.exists()){
            System.out.println("File name is " + f.getName());
            System.out.println("File path is " + f.getAbsolutePath());
            System.out.println("File size is " + f.length() + " bytes");
            System.out.println("Is file writable ?" + f.canWrite());
        }else{
            System.out.println("File does not exist");
        }
    }
}
