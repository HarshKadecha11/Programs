class args extends Exception{
    public args(String message){
        super(message);
    }
}


public class Paper1 {
    public static void main(String[] args) {
        try {
            if(args.length<3){
                throw new args("Please provide three command line arguments");
            }else {
                System.out.println("The Command line arguments you provided is : ");
                for(String i:args) {
                    System.out.println(i);
                }
            }
        }catch(args a){
            System.out.println(a.getMessage());
        }
    }
}
