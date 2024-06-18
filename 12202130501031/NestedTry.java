class NestedTry {
    public static void main(String[] args) {
        try {
            try{
                System.out.println("Going to divide it by 0 !!");
                int b = 39/0 ; 
            }catch(ArithmeticException e ){
                System.out.println(e);
            }
            try {
                int a[] = new int[5] ; 
                    // Assigning value that is out of bound in array .... 
                a[5] = 4 ; 
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e); 
            }
            System.out.println("!!!!");
        }catch(Exception e ){
            System.out.println("Handled the exceptions !!");
        }
        System.out.println("Normal flow");
    }
}
