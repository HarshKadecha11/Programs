import java.util.* ; 

class temp_n extends Exception{
    public temp_n(String message){
        super(message);
    }
}


class paper {
    public static void main(String[] args) {
        int sum = 0 ; 
        int avg ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of days : ");
        int n = sc.nextInt(); 
        int[] temp = new int[n] ; 
        for(int i=1; i<=n ; i++){
            System.out.println("Enter the temperature in Celsius of Day " + i);
            int j = 0 ; 
            temp[j] = sc.nextInt();
            j++ ; 
        }
        
        for(int i=0; i<n ; i++){
                sum += temp[i] ; 
        }
                
            
        avg = sum/n ;
        System.out.println("Average Temperature is " + avg); 
            
        }
        //System.out.println(sum);
        
        
        
    
    }
