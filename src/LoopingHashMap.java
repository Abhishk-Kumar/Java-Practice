//import java.security.Key;
import java.util.HashMap;

public class LoopingHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities=new HashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington Dc");
//        String key="USA";
//        System.out.println(capitalCities.get(key));
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
    }
}
