import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner inpush=new Scanner(System.in);
        System.out.println("Enter Number to check :");
        int number=inpush.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        } else if (number==0) {
            System.out.println("Number is zero");
        } else  {
            System.out.println("Number is negative");
        }
    }
}
