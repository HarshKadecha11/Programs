class Printdemo { 
    public void printcount() { 
        try {
            for ( int i=5 ; i>0 ; i--) {
                System.out.println("Counter -- " + i);

            }
        }catch(Exception e) {
            System.out.println("Thread Interrupted ..."); 

        }
    }
}
class Demo extends Thread {
    private Thread t ; 
    private String Threadname ; 
    Printdemo pd ; 
    Demo(String name , Printdemo PD) {
        Threadname = name ; 
        pd = PD ; 
    }
    public void run() {
        synchronized (pd) {
            pd.printcount();
        }
        

        System.out.println("Thread " + Threadname + " Exiting.");
    }
        
    public void harsh() {
        System.out.println("Starting " + Threadname );
        if(t==null) {
            t = new Thread(this , Threadname) ; 
            t.start();
        }
    }
}


class WO_Syn {
    public static void main(String[] args) {
        Printdemo PD = new Printdemo() ; 

        Demo o1 = new Demo("Thread 1 " , PD) ; 
        Demo o2 = new Demo("Thread 2 "  , PD) ;

        o1.harsh();
        System.out.println();
        o2.harsh() ; 

        try{
            o1.join();
            o2.join();

        }catch(Exception e) {
            System.out.println("Interrupted ");

        }

    }
}
