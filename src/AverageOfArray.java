public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr={5,10,15,35,67,89,12};
//sum+=i => add index of elementy to sum
//        sum+=arr[i]=>adds particular element at that index top the sum
        int sum=0;
        float result;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
         sum+=arr[i];


        }
        int len=arr.length;
        System.out.println(sum);
        result=sum/ len;
        System.out.println(result);
    }
}
