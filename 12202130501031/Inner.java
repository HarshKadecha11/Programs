class Inner { 

    void mymethod() {
        int n = 20 ; 
        class inner { 
             
            public void print() { 

                System.out.println("This is the method of inner class : " + n) ;
            }
        }
        inner i = new inner() ; 
        
        i.print();
    }
    public static void main(String[] args) {
        Inner i1 = new Inner() ; 
        i1.mymethod(); 
    }
}