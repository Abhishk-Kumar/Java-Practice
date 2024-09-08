import java.util.Scanner;

public class DetermineGreatest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inpush=new Scanner(System.in);
        a=inpush.nextInt();
        b=inpush.nextInt();
        c=inpush.nextInt();

        if(a>=b && a>=c){
            System.out.println("first number is greatest : " +a);
        } else if (b>=c ) {
            System.out.println("second number is greatest : " +b);
        }
        else {
            System.out.println("third number is greatest : " +c);
        }


    }
}
