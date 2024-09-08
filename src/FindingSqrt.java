import java.util.Scanner;

public class FindingSqrt {
    public static void main(String[] args) {
        Scanner inpush=new Scanner(System.in);
        float num= inpush.nextFloat();
        double result= Math.sqrt(num);
        System.out.println(result);
    }
}
