import java.io.* ; 

public class Delete {
    public static void main(String[] args) {
        File file = new File("Documents\\Work\\newfile.txt");
        if(file.delete()){
            System.out.println(file.getName() + " is deleted.");
        }else{
            System.out.println("Unexpected error!!!");
        }
    }
}
