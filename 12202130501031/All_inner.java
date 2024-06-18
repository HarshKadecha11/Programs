/**
 * InnerAll_inner
 */
interface InnerAll_inner {
    String College = "GCET" ; 
    public void getCollege() ;
}
class Outer {
    void display() { 
        System.out.println("Inside Outer class.") ;
    }
    class Inner {
        void display() {
            System.out.println("Inside inner class. " ); 

        }

    }
    static class InnerStatic { 
        void display() {
             System.out.println("Inside inner static class.");

        }
    }
}
class All_inner {
    public static void main(String[] args) {
        Outer o = new Outer() ; 
        o.display(); 
        Outer.Inner i = o.new Inner() ; 
        i.display(); 
        Outer.InnerStatic is = new Outer.InnerStatic() ; 
        is.display(); 

        InnerAll_inner an = new InnerAll_inner() {
            public void getCollege() {
                System.out.println("Inside Anonymous inner class. "); 

            }
        };
        an.getCollege();


    }
}
