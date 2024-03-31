import java.util.*;
class BanAccount{
    String d_name;
    int a_no;
    String a_type;
    int bal;

    BanAccount(){
        d_name="abhay";
        a_no=1;
        a_type="saving";
        bal=10;

    }
    BanAccount(String d,int a,String at,int b){
        d_name=d;
        a_no=a;
        a_type=at;
        bal=b;
    }
    void display(){
        System.out.println("name"+d_name);
        System.out.println("account no"+a_no);
        System.out.println("account type"+a_type);
        System.out.println("bal"+bal);

    }

}
class cons{
    public static void main(String[] args){
        BanAccount x=new BanAccount();
        x.display();
        BanAccount y = new BanAccount("Harsh", 2 , "Savings ", 100) ; 
        y.display();


    }

}