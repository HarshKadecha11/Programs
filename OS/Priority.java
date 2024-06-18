class Priority extends Thread{
    public void run() {
        System.out.println("Inside Run....");
    }
    public static void main(String[] args) {
        
        Priority p1 = new Priority() ;
        Priority p2 = new Priority() ;
        Priority p3 = new Priority() ; 

        System.out.println("Priority of 1st thread is " + p1.getPriority());
        System.out.println("Priority of 2nd thread is " + p2.getPriority());
        System.out.println("Priority of 3rd thread is " + p3.getPriority());

        p1.setPriority(6);
        p2.setPriority(3);
        p3.setPriority(9);
        System.out.println(" ");

        System.out.println("Priority of 1st thread is " + p1.getPriority());
        System.out.println("Priority of 2nd thread is " + p2.getPriority());
        System.out.println("Priority of 3rd thread is " + p3.getPriority());

        System.out.println("Currently running thread : " + Thread.currentThread().getName());
        System.out.println("Priority of main thread : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority of main thread : " + Thread.currentThread().getPriority());


    }
}