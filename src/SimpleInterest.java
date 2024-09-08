import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //program to calculate simple interest
        Scanner inpush=new Scanner(System.in);
        System.out.println("Enter your principle amount:");
        int principle= inpush.nextInt();
        System.out.println("Enter your rate of interest :");
        float rate=inpush.nextFloat();
        System.out.println("Enter your time of interval:");
        float time=inpush.nextFloat();

        float interest=(principle*rate*time)/100;
        System.out.println(interest);
    }
}
