class Nested_Try {
    public static void main(String[] args) {
        try { 
            int a = args.length ; 
            
            int b = 12 / a ; 
            System.out.println("a = " + a );
            try {
                if (a==1) {
                    a = a/(a-a) ; 

                }
                if (a==2) {
                    int c[] = { 1 } ;
                    c[4] = 10 ; 
                }
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
