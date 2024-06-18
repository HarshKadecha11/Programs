class Outer_Demo { 
    private int num = 10 ; 
    class inner_demo{
        int getnum() {
            System.out.println("The Private data member is : ");
            return num ; 
        }

    }
}
class tr {
    public static void main(String[] args) {
        Outer_Demo o = new Outer_Demo() ; 
        Outer_Demo.inner_demo i = o.new inner_demo() ; 
        System.out.println(i.getnum());
    }
}