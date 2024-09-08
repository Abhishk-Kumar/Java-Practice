import java.util.Scanner;

public class DetermineWords {
    public static void main(String args[]){
        //logic
//        split method in java convert string into array of substrings and wer use
//        regular expression so it can split on the basis of whitespace characters(newline,whitespace,tab(\t),etc)

        Scanner inpush=new Scanner(System.in);
        String str=inpush.nextLine();
        int countWords=str.split("\\s").length;
        System.out.println("length of words in string is : "+countWords);
    }
}
