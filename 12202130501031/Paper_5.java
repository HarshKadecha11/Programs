class Sumthread implements Runnable
{
    Thread t;
    int start;
    int end;
    static int sum = 0;
    Sumthread(int start, int end)
    {
        this.start=start;
        this.end=end;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        for(int i=start;i<=end;i++)
        {
            synchronized (this)
            {
                sum+=i;
            }
        }
    }
}

public class Paper_5
{
    public static void main(String[] args)
    {
        Sumthread t1 = new Sumthread(1,25);
        Sumthread t2 = new Sumthread(26,50);
        Sumthread t3 = new Sumthread(51,75);
        Sumthread t4 = new Sumthread(76,100);

        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + Sumthread.sum);
    }
}