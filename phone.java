public class phone {
    String brand="apple";
    String model="17 pro max";
    void call(){
        System.out.println("calling from iphone" +this.model);
    }
    void message(){
        System.out.println("message from iphone");

    }
    
    
    public static void main(String[] args) {
        phone p1 = new phone();
        phone p2 = new phone();
        phone p3 = new phone();
        phone p4 = new phone();
        p1.call();
        p2.call();
        p3.call();
        p4.call();
        p1.message();
        p2.message();
        p3.message();
        p4.message();
        


    }
    
}
