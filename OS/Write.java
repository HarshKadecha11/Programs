import java.io.*;
public class Write {
    public static void main(String[] args) {
            try {
                File file = new File("Documents\\Work\\newfile.txt");
                FileWriter fw = new FileWriter(file);
                fw.write("Hello, World!\n");
                fw.write("Hello, Harsh !");
                fw.close();
            }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } 
}
