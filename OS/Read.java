import java.io.* ; 
import java.util.* ;


public class Read {
    public static void main(String[] args) {
        try {
            File file = new File("Documents\\Work\\newfile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                System.out.println("");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }
}
    

