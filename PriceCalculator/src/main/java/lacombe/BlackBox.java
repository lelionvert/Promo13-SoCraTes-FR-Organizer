package lacombe;

import static lacombe.Choice.*;

public class BlackBox {

    public static final int MEAL_PRICE = 40;

    public static long calculatePrice(String input) {
        if (isSingle(input)) {
            return calculatePriceFor(input, SINGLE);
        } else if (isNoAccomodation(input)) {
            return calculatePriceFor(input, NO_ACCOMMODATION);
        } else if (isTwin(input)) {
            return calculatePriceFor(input, TWIN);
        } else if (isTriple(input)) {
            return calculatePriceFor(input, TRIPLE);
        } else {
            return 0;
        }
    }

    private static long calculatePriceFor(String input, Choice choice) {
        if (isArrivedOnFriday(input) || isDepartureOnSaturday(input)) {
            return choice.getPrice() - MEAL_PRICE;
        }
        return choice.getPrice();
    }

    private static boolean isDepartureOnSaturday(String input) {
        return input.contains(("samedi"));
    }

    private static boolean isArrivedOnFriday(String input) {
        return input.contains(("vendredi"));
    }

    private static boolean isTriple(String input) {
        return input.contains(TRIPLE.getName());
    }

    private static boolean isTwin(String input) {
        return input.contains(TWIN.getName());
    }

    private static boolean isNoAccomodation(String input) {
        return input.contains(NO_ACCOMMODATION.getName());
    }

    private static boolean isSingle(String input) {
        return input.contains(SINGLE.getName());
    }
}
