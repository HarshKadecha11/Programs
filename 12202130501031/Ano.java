class Anon{
    public void createclass() { 
        Polygon p1 = new Polygon() {
            public void display() { 
                System.out.println("This is the Anonymous class. ");
            }
        } ; 
        p1.display();
    }

}

class Ano{
    public static void main(String[] args) {
        Anon a = new Anon() ;
        a.createclass();
    }
}