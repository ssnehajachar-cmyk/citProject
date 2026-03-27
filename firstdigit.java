import java.util.Scanner;
public class firstdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        while(num>=10){
            num=num/10;
        }
        
        System.out.println("firstdigit is:" +num);
        
    }
}