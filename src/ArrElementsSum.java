

public class ArrElementsSum {
    public static void main(String[] args) {
int arr[]={1,3,5,6,7,8,9,122};
        int sum=0;
for(int i=0;i<arr.length;i++){

//    sum+=arr[i];
    sum=sum+arr[i]; // for adding values of elements to sum
    // if u want to add index to sum => use sum=sum+i;  i gives index and arr[i] gives its value
}
        System.out.println("Sum is :"+sum);

    }
}
