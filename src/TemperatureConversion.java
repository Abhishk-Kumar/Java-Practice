import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner inpush=new Scanner(System.in);
        System.out.println("Enter your temperature:");
        float fah=inpush.nextFloat();
        System.out.println("Enter your temperature2:");
        float celcius=(fah-32)*5/9;
        System.out.println("ur temperature is "+ celcius + "C");
    }
}
