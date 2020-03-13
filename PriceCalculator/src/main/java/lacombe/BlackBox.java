package lacombe;

public class BlackBox {

    public static final String SINGLE = "Single"; // TODO: verfier les maj (ajouter des tests tech)
    public static final String NO_ACCOMMODATION = "No Accommodation";
    public static final String TWIN = "Twin";
    public static final String TRIPLE = "Triple";

    public static long calculatePrice(String input) {
        if (input.contains(SINGLE)) {
            if(input.contains(("vendredi"))){
                return 570;
            }
            return 610;
        } else if (input.contains(NO_ACCOMMODATION)) {
            if (input.contains("samedi")) {
                return 200;
            }
            return 240;
        } else if (input.contains(TWIN)){
            if (input.contains(("samedi"))) {
                return 470;
            }
            return 510;
        } else if (input.contains(TRIPLE)) {
            if(input.contains("vendredi")){
                return 370;
            }
            return 410;
        } else {
            return 0;
        }
    }
}
