public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ITThread());
        Thread thread2 = new Thread(new CETHread());

        thread1.start();
        thread2.start();
    }
}

class ITThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("from IT");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CETHread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("from CE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}