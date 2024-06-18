import java.util.* ;

import javax.sound.sampled.SourceDataLine; 
class notenoughmoneyException extends Exception {
    notenoughmoneyException(String s){
        super(s) ;
    }
} 

class bankaccount {
    double balance , withdraw , new_depo ; 
    String name , acc_type ; 
    public static void exit() {
        exit() ;
    }
    void createAcc(){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Create bank account !!");
        System.out.println("Enter your full name : ");
        name = sc.nextLine() ; 
        System.out.println("Enter your account type (Saving/Current) : ");  
        acc_type = sc.nextLine() ;
        System.out.println("Enter your initial balance : ");
        balance = sc.nextDouble() ; 
    }
    void deposit() {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Your current account balance is : " + balance);
        System.out.println("Enter the amount to be deposit : ") ;
        new_depo = sc.nextDouble() ;
        balance += new_depo ;
        System.out.println("Your new account balance is : " + balance);
    }
    void withdraw() {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Your current account balance is : " + balance);
        System.out.println("Enter the amount to be withdraw : ") ;
        withdraw = sc.nextDouble() ;
        try{
            if(balance < withdraw ) {
                throw new ArithmeticException("Amount exceed current balance!!") ;
            }
            balance -= withdraw ; 
            System.out.println("Your account balance after withdrawing is : "+ balance);
            try{
                if(balance < 500) {
                    throw new notenoughmoneyException("Minimum balance is 500!!");
                }
            }catch(notenoughmoneyException e) {
                System.out.println(e);
                System.exit(0) ; 
            }
        }catch(ArithmeticException e) {
            System.out.println(e);
            System.exit(0) ;
        }
        
    }
    void display() {
        System.out.println("Account Information ....");
        System.out.println("Account holder name : " + name);
        System.out.println("Account type : " + acc_type);
        System.out.println("Account balance : " + balance);

    }
}
class Bank_Acc{
    public static void main(String[] args) {
        bankaccount b = new bankaccount() ; 
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt() ; 
            switch (choice) {
                case 1:
                    b.createAcc();                    
                    break;
                case 2:
                    b.deposit();
                    break ; 
                case 3:
                    b.withdraw();
                    break ; 
                case 4:
                    b.display();
                    break ; 
                default:
                    break;
            }
        }
    }

}