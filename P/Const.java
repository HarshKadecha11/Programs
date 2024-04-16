class box {
    int height ; 
    int width ; 
    int depth ;
    box() {
        height = 10 ; 
        width = 20 ; 
        depth = 30 ; 
    }
    box(int h , int w , int d) {
        height = h ; 
        width = w ; 
        depth = d ; 
    }

    void volume() {
        System.out.println("The Volume is " + (height*width*depth));
    }
}
class Const{
    public static void main(String[] args) {
        box b = new box(10,20,40); 
        b.volume(); 
    }
}
