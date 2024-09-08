import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //logic: we will take input original string
        //looping through at string and get each character through charat[i]
//        and then add each got character to reversed string now it wiill add it to front of string
                //and automatically h get at last as new character come in front thats how it got reverse

        Scanner inpush=new Scanner(System.in);
        System.out.println("Enter original String");
        String originalStr=inpush.nextLine();
        String reversedString="";


        for (int i=0;i<originalStr.length();i++){
           reversedString=originalStr.charAt(i) +reversedString;
        }
        String result=reversedString;
        System.out.println("Reversed String is "+result);


    }
}
