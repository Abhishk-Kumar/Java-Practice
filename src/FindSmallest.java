public class FindSmallest {
    public static void main(String[] args) {
        // find smallest element in an array
        int[] arr={78,24,56,34,21,90};
        int lowestno=arr[0];
        for (int i=0;i<arr.length;i++){
            if(lowestno>arr[i]){
                lowestno=arr[i];
            }

        }
        System.out.println(lowestno);
    }
}
