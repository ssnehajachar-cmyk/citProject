public class Unaryoperator {
    public static void main(String[] args){
        int x=5;
        System.out.println("Original: "+x);
        //x++ (post increment)
        System.out.println("Post Increment: "+(x++));//5
        System.out.println("After Increment: "+x);//6
        System.out.println("Pre Increment: "+(++x));
        System.out.println("After Increment: "+x);
        System.out.println("Pre Decrement: "+(--x));
        System.out.println("After Decrement:"+x);
        System.out.println("Post Decrement:"+(x--));
        System.out.println("After Decrement: "+x);
    }
    
}
