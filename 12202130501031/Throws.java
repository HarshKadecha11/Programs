class Throws {
    static void throwone() throws IllegalAccessError {
        System.out.println("Inside throwone  ");
        throw new IllegalAccessError("Demo") ; 
    }
    public static void main(String[] args) {
        try{
            throwone();
        }catch(IllegalAccessError e) {
            System.out.println("Caught : " + e);
        }
    }
}
