package lacombe;

public class BlackBox {

    public static final String SINGLE = "Single";
    public static final String NO_ACCOMMODATION = "No Accommodation";
    public static final String TWIN = "Twin";
    public static final String TRIPLE = "Triple";

    public static long calculatePrice(String input) {
        if (input.contains(SINGLE)) {
            return 610;
        } else if (input.contains(NO_ACCOMMODATION)) {
            return 240;
        } else if (input.contains(TWIN)){
            return 510;
        } else if (input.contains(TRIPLE)) {
            return 410;
        } else {
            return 0;
        }
    }
}
