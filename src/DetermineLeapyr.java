import java.util.Scanner;

 class DetermineLeapyr {
    public static void main(String[] args) {
        Scanner inpush=new Scanner(System.in);
        int year=inpush.nextInt();
        if(year/400==0){
            System.out.println("Yes its leap year");
        }else if(year%4==0 && year%100!=0){
            System.out.println("yes its leap year");
        }else{
            System.out.println("Not a leap year");
        }

    }
}
