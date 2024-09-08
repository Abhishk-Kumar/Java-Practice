import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner inpush=new Scanner(System.in);
        System.out.println("Enter your principle amount:");
        int principle= inpush.nextInt();
        System.out.println("Enter your rate of interest :");
        float rate=inpush.nextFloat();
        System.out.println("Enter your time of interval:");
        float time=inpush.nextFloat();

        double compoundInterest=principle*Math.pow((1+rate/100),time);
        System.out.println(compoundInterest);

    }
}
