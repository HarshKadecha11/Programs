class CPU { 
    double price ; 
    CPU(double price) {
        this.price = price ; 
    }

    class Processor {
        double cache , cores ; 
        String manufacture ; 
        Processor(String manufacture , double cache , double cores){
            this.cache = cache ; 
            this.cores = cores ; 
            this.manufacture = manufacture ;
        }
        double getCache() {
            return cache ; 
        }
        void Processordetails() {
            System.out.println("Manufacture : " + manufacture);
            System.out.println("Cores : " + cores );
            System.out.println("Cache : " + getCache()) ;
            System.out.println("Price : " + price);
        }
    }
    protected class RAM{
        double memory , clockspeed ; 
        String manufacturer ; 
        RAM(String manufacturer , double memory , double clockspeed){
            this.clockspeed = clockspeed ; 
            this.manufacturer = manufacturer ; 
            this.memory = memory ; 
        }
        double getClockspeed() {
            return clockspeed ; 
        }
        void RAMdetails() {
            System.out.println("Manufacturer : " + manufacturer);
            System.out.println("Memory : " + memory);
            System.out.println("Clockspeed : " + getClockspeed() );

        }

    }
}
class Pro {
    public static void main(String[] args) {
        CPU c = new CPU(12000) ; 
        CPU.Processor p = c.new Processor("Dell", 5 , 200000) ; 
        CPU.RAM r = c.new RAM("Duracell ", 12, 12) ; 

        p.Processordetails()  ; 
        r.RAMdetails() ; 
    }
    
}
