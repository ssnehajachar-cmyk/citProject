public class Nestedif {
    public static void main(String[] args) {
        int age=65;
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to avail government fund");

            }
            else
                System.out.println("We are not eligible to vote avail government scheme");

        } else
            System.out.println("We are not eligible to vote");



    }
}
