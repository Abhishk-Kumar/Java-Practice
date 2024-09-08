import java.util.ArrayList;

public class LoopingArrayList {
    public static void main(String[] args) {
        // array in java has fixed sizze means u have to create new array to add or remove element from it
        //but u can use arraylist to feel free to update anything at anytime
        ArrayList<String> cars=new ArrayList<String>();
         cars.add("ford");
        cars.add("Valeno");
        cars.add("Safari");
        cars.add("Thar");
        cars.add("suv");
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
