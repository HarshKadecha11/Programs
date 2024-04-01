//class Cricket having data members name, age and member methods display() and
//setdata(). class Match inherits Cricket and has data members no_of_odi, no_of_test.
//Create an array of 5 objects of class Match. Provide all the required data through
//the command line and display the information.

import java.util.* ; 
class Cricket{
    int age ; 
    String name ; 
     
    void setdata(String name , int age){
        this.name = name ; 
        this.age = age ; 
    }
    void display() { 
        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
    }
}
class Match extends Cricket {
    int no_of_odi ; 
    int no_of_test ; 

    void setdata(String name , int age , int no_of_odi , int no_of_test) {
        super.setdata(name , age);
        this.no_of_odi = no_of_odi ; 
        this.no_of_test = no_of_test ; 
    }
    void display() {
        super.display();
        System.out.println("No of ODI Played = " + no_of_odi) ; 
        System.out.println("No of Test Played = " + no_of_test) ; 

    }
}
class Prac4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Match[] m = new Match[5] ; 

        for (int i=0 ; i<5 ; i++) {
            m[i] = new Match() ; 
            System.out.println("Enter the details for "+(i+1)+" player...") ; 
            System.out.print("Name : ") ; 
            String name = sc.nextLine() ; 
            System.out.print("Age :") ; 
            int age = sc.nextInt() ;
            sc.nextLine(); 

            System.out.print("No of ODI : ") ; 
            int no_of_odi = sc.nextInt() ; 
            sc.nextLine();

            System.out.print("No of Test : ") ; 
            int no_of_test = sc.nextInt() ; 
            sc.nextLine();

            System.out.println("INFORMATION OF PLAYERS..."); 
            for(Match match : m ){
                match.display();
                System.out.println(); 
            }

        }
    }
}