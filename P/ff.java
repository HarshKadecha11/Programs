import java.util.*; 


class BankAccount{
    String D_name ; 
    int Acc_no ; 
    String Acc_type ; 
    int balance ; 

    Scanner sc = new Scanner(System.in) ; 

    void createAccount() {
        System.out.print("Enter the name : ") ; 
        D_name = sc.nextLine() ; 
        System.out.println("");
        System.out.print("Enter Acc number : ");
        Acc_no = sc.nextInt() ; 
        System.out.println("");
        System.out.print("Enter the Acc type : ") ; 
        Acc_type = sc.nextLine() ;
        System.out.println(""); 
        System.out.print("Enter Balance : ");
        balance = sc.nextInt() ; 
        System.out.println("");
    }
    void depo(){
        System.out.println("Enter the amount you want to deposit : ");
        int temp = sc.nextInt() ; 
        balance = balance + temp ; 

        System.out.println("So Total money in account is " + balance);

    }

    void withdraw() {
        System.out.println("Enter the amount you want to withdraw : ");
        int amt ; 
        amt = sc.nextInt() ; 
        if(amt>balance) {
            System.out.println("Insuffficient balance !!!! ");
        }else {
            balance -= amt ; 

        }
        System.out.println("So Total money in account is " + balance);
    }

    void b_inquiry() {
        System.out.println("Acc name " + D_name);
        System.out.println("Acc no " + Acc_no);
        System.out.println("Acc Type " + Acc_type);
        System.out.println("Total balance : " + balance);

    }
}

class ff {
    public static void main(String[] args) {
        BankAccount b  = new BankAccount() ; 
        b.createAccount(); 
        b.depo(); 
        b.withdraw(); 
        b.b_inquiry();
    }
}