interface property {
    public double compute_price() ; 
}
class Bunglow implements property{ 
    String name ; 
    double ConstructionArea ; 
    double landarea ; 
    public Bunglow(String name , double ConstructionArea , double landarea) {
        this.name = name ; 
        this.ConstructionArea = ConstructionArea ; 
        this.landarea = landarea ; 
    }
    @Override
    public double compute_price() {      //Override
        double construction_cost = ConstructionArea * 500 ; 
        double land_cost = landarea * 400 ; 
        double additional_cost = landarea * 200 ; 
        return construction_cost + land_cost + additional_cost ; 
    }
}
class Flat implements property { 
    String name ; 
    double ConstructionArea ; 
    public Flat(String name , double ConstructionArea) {
        this.name = name ; 
        this.ConstructionArea = ConstructionArea ; 
    }
    @Override
    public double compute_price() {        // Override
        double construction_cost = ConstructionArea * 500 ; 
        double additional_cost = 200000 ; 
        return construction_cost + additional_cost ; 
    }
}


public class Prac_4_3{
    public static void main(String[] args) {
        Bunglow b = new Bunglow("City View" , 2000 , 1500) ; 
        double bunglow_price = b.compute_price() ; 
        System.out.println("Bunglow - " + b.name + " Price: Rs." + bunglow_price);


        Flat f = new Flat("Real Heights" , 1200) ; 
        double flat_price = f.compute_price() ; 
        System.out.println("Flat - " + f.name + " Price: Rs. " + flat_price) ;
    }
}
