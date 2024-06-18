class Outer {
    int x = 100 ; 
    void test() {
        Inner i = new Inner() ; 
        i.display() ; 
    }

    class Inner {
        int y = 10 ; 
        void display() {
            System.out.println("Display x = " + x);
        }
    }

    void showy() { 
        System.out.println(y);
    }
}

class InnerDemo {
    public static void main(String[] args) {
        Outer o = new Outer(); 
        o.test() ; 
    }
}