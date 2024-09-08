import java.util.Random;

public class GeneratingRandomNO {
    public static void main(String[] args) {
//        double number= Math.random();
//        System.out.println(number);

        Random random=new Random();
        int randomNumber=random.nextInt(6)+1;
        System.out.println(randomNumber);
//         +1 to avoid zero
    }
}
