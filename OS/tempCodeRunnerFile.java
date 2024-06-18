class GFG implements Runnable {
    public void run(){
        System.out.println("Thread is Running Successfully");
    }
    public static void main(String[] args){
        GFG g1 = new GFG();
// initializing Thread Object
        Thread t1 = new Thread(g1);
        t1.start();
    }
}