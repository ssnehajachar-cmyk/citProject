import javax.swing.event.SwingPropertyChangeSupport;

public class Typecastingoperator {
    public static void main(String[] args){
        double d=9.78;
        int num = (int)d;
        System.out.println("Double value before conversion:"+d);
        System.out.println("Double value after conversion:"+num);
        int a=10;
        double di=(double)a;
        System.out.println("Integer value before conversion: "+a);
        System.out.println("Integer value after conversion: "+d);
        int x=90;
        double value=x;
        System.out.println("implicit"+value);//i
    }
    
}
