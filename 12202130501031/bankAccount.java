import java.util.Scanner;
class BankAccount{
    private static int nextAccountNumber = 1;
    private String depositorName;
    private int accNo;
    private String accType;
    private double balance;

    // Constructor
    public BankAccount(String depositorName, String accType) {
        this.depositorName = depositorName;
        this.accNo = nextAccountNumber++;
        this.accType = accType;
        this.balance = 0.0; // Initially balance is set to 0
    }

// Member Functions
    public void createAcc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter depositor name:");
        this.depositorName = scanner.nextLine();
        System.out.println("Enter account type:");
        this.accType = scanner.nextLine();
        this.accNo = nextAccountNumber++;
        this.balance = 0.0;
        System.out.println("Account created successfully with account number: " + this.accNo);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        }else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    public void balanceInquiry(){
        System.out.println("Current balance: " + this.balance);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Creating a bank account
            System.out.println("Creating a new bank account...");
            System.out.println("Enter depositor name:");
            String depositorName = scanner.nextLine();
            System.out.println("Enter account type:");
            String accType = scanner.nextLine();

            BankAccount account = new BankAccount(depositorName, accType);

            // Operations on the account
            System.out.println("Account created successfully with account number: " + account.accNo);

            System.out.println("Enter deposit amount:");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.println("Enter withdrawal amount:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            account.balanceInquiry();
            }
    }
