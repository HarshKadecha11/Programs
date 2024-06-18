public class hello extends Thread {
    public void run() {
        System.out.println("Harsh Kadecha") ; 
    }
    public static void main(String args[]){
        hello t = new hello() ; 
        t.start() ; 
    }
}