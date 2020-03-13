package lacombe;

public class BlackBox {

    public static final String SINGLE = "Single"; // TODO: verfier les maj (ajouter des tests tech)
    public static final String NO_ACCOMMODATION = "No Accommodation";
    public static final String TWIN = "Twin";
    public static final String TRIPLE = "Triple";
    public static final int MEAL_PRICE = 40;

    public static long calculatePrice(String input) {
        if (isSingle(input)) {
            if(input.contains(("vendredi"))){
                return 610 - MEAL_PRICE;
            }
            return 610;
        } else if (isNoAccomodation(input)) {
            if (input.contains("samedi")) {
                return 240 - MEAL_PRICE;
            }
            return 240;
        } else if (isTwin(input)){
            if (input.contains(("samedi"))) {
                return 510 - MEAL_PRICE;
            }
            return 510;
        } else if (isTriple(input)) {
            if(input.contains("vendredi")){
                return 410 - MEAL_PRICE;
            }
            return 410;
        } else {
            return 0;
        }
    }

    private static boolean isTriple(String input) {
        return input.contains(TRIPLE);
    }

    private static boolean isTwin(String input) {
        return input.contains(TWIN);
    }

    private static boolean isNoAccomodation(String input) {
        return input.contains(NO_ACCOMMODATION);
    }

    private static boolean isSingle(String input) {
        return input.contains(SINGLE);
    }
}
