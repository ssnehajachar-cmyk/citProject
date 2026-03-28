public class Car1 {
    String brand;
    String model;
    int speed=0;
    
    void accelerator(){
        speed=speed+5;
        System.out.println(brand+" accelerating,speed is " +speed);

    }
        
        void brake(){
        speed=speed-5;
        System.out.println(brand+ "is slowing down "+ speed);
    }


    public static void main(String[] args) {
        Car1 c1=new Car1();
        c1.brand="BMW";
        Car1 c2=new Car1();
        c2.brand="porsche";

        System.out.println(c1.brand);
           System.out.println (c2.brand);

        c1.accelerator();
        c2.accelerator();
    c1.brake();
    c2.brake();
        
        
        
    }
    
    }

    

