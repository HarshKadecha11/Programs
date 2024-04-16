import java.util.* ; 
interface GeometricShape{
    public void describe();
}
interface TwoDShape extends GeometricShape {
    public double area();
}
interface ThreeDShape extends GeometricShape {
    public double volume();
}
class Cone implements ThreeDShape {
    private double radius;
    private double height;
    public Cone (double radius, double height){
        this.radius = radius ; 
        this.height = height ; 
    }
    public double volume(){
        double r ; 
        r = (1.0/3.0)*(3.14*radius*radius*height) ; 
        return r ; 
    }
    public void describe(){
        System.out.println("It is a 3D Shape.") ; 
    }
}
class Rectangle implements TwoDShape {
    private double width,height;
    public Rectangle (double width, double height){
        this.height = height ; 
        this.width = width ;
    }
    public double area(){
        double r ; 
        r = ((height)*(width)) ; 
        return r ; 
    }
    public double perimeter(){
        double r; 
        r = ((2.0)*(height + width)) ; 
        return r ; 
    }
    public void describe(){
        System.out.println("It is a 2D Shape.") ;
    }
}
class Sphere implements ThreeDShape {
    private double radius;
    public Sphere (double radius){
        this.radius = radius ; 
    }
    public double volume(){
        double r ; 
        r = ((4.0/3.0)*(3.14*radius*radius*radius)) ; 
        return r ; 
    }
    public void describe(){
        System.out.println("It is a 3D Shape.") ; 
    }
}

public class Prac_4_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter the Radius of Cone : ") ;
        double radius = sc.nextInt(); 
        sc.nextLine() ; 
        System.out.print("Enter the Height of Cone : ") ;
        double height = sc.nextInt();
        sc.nextLine() ; 
        Cone c  = new Cone(radius , height) ;
        c.describe(); 
        System.out.println("So Volume of Cone is :" + c.volume()) ; 

        System.out.print("Enter the Width of Rectangle : ") ;
        double Width = sc.nextInt(); 
        sc.nextLine() ;
        System.out.print("Enter the Height of Rectangle : ") ;
        double h = sc.nextInt();
        sc.nextLine() ;
        Rectangle r  = new Rectangle(Width , h) ;
        r.describe(); 
        System.out.println("So Area of Rectangle is :" + r.area()) ; 
        System.out.println("So Perimeter of Rectangle is : " + r.perimeter()); 

        System.out.print("Enter the Radius of Sphere : ") ;
        double ra = sc.nextInt(); 
        sc.nextLine() ;
        Sphere s = new Sphere(ra) ; 
        s.describe(); 
        System.out.println("So Volume of Sphere is :" + s.volume())
    }
}