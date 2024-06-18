import java.util.Scanner;

class ArithmeticException extends Exception
{
    ArithmeticException(String msg)
    {
        super(msg);
    }
}

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] ele;

        try{
            System.out.print("Enter the total number of element: ");
            int n = sc.nextInt();
            ele = new double[n];
            if(n==0)
            {
                throw new ArithmeticException("cannot enter negative or zero");
            }
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter "+(i+1)+" element");
                ele[i] = sc.nextDouble();
            }
            try{
                double avg=0;
                for(int i=0;i<n;i++)
                {
                    if(ele[i]<0)
                    {
                        throw new ArithmeticException("Elements cannot be negative");
                    }
                    avg+=ele[i];
                }
                double res=avg/n;
                System.out.println("The average is "+res);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}