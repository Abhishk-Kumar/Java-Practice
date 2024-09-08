public class LoopingEnum {
    public static void main(String[] args) {


//        enum elements are like final variables
        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }
        for (Level myvar : Level.values()) {
            System.out.println(myvar);
        }


    }
}

