class Runn{ 
    public static void main(String[] args) {
        new newT() ; 
        try {
            for(int i=5 ; i>0 ; i--) {
                System.out.println("Main Thread : " + i );
                Thread.sleep(1000) ; 

            }
        }catch(InterruptedException e) {
            System.out.println("Main Thread Interrupted. ") ;

        }
        System.out.println("Exiting...") ;
        
    }
}
class newT implements Runnable{
    Thread t ;
    newT() {
        t = new Thread(this , "Demo Thread") ; 
        System.out.println("Child Thread : " + t );
        t.start() ; 
    } 
    public void run() {
        try {
            for(int i=5 ; i>0 ; i--) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(500) ; 
            }

        }catch(InterruptedException e) {
            System.out.println("Child Thread Interrupted ");
        }
        System.out.println("Exiting Child Thread.");
    }

}