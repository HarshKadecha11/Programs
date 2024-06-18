class main extends Exception{
    main(String s) {
        super(s) ; 
    }
}
class MyException{
    public static void main(String[] args) {
        try{
            throw new main("GCET") ; 
        }catch(main ex) {
            System.out.println("Caught"); 
            System.out.println(ex.getMessage());
        }
    }
}