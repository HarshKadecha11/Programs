class MultiPriority extends Thread {
    public void run() {
        System.out.println("Inside run......");

    }
    public static void main(String[] args) {
        Thread.currentThread().setPriority(10) ; 
        System.out.println("Priority of main thread : " + Thread.currentThread().getPriority());

        MultiPriority ob1 = new MultiPriority() ; 
        System.out.println("Priority of OB1 :" + ob1.getPriority()); 

    }
}
