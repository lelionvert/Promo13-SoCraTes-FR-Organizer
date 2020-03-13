package lacombe;

public class BlackBox {

    public static final int MEAL_PRICE = 40;

    public static long calculatePrice(String input) {
        if (isSingle(input)) {
            if (isArrivedOnFriday(input) || isDepartureOnSaturday(input)) {
                return Choice.SINGLE.getPrice() - MEAL_PRICE;
            }
            return Choice.SINGLE.getPrice();

        } else if (isNoAccomodation(input)) {
            if (isArrivedOnFriday(input) || isDepartureOnSaturday(input)) {
                return Choice.NO_ACCOMMODATION.getPrice() - MEAL_PRICE;
            }
            return Choice.NO_ACCOMMODATION.getPrice();
        } else if (isTwin(input)) {
            if (isArrivedOnFriday(input) || isDepartureOnSaturday(input)) {
                return Choice.TWIN.getPrice() - MEAL_PRICE;
            }
            return Choice.TWIN.getPrice();
        } else if (isTriple(input)) {
            if (isArrivedOnFriday(input) || isDepartureOnSaturday(input)) {
                return Choice.TRIPLE.getPrice() - MEAL_PRICE;
            }
            return Choice.TRIPLE.getPrice();
        } else {
            return 0;
        }
    }

    private static boolean isDepartureOnSaturday(String input) {
        return input.contains(("samedi"));
    }

    private static boolean isArrivedOnFriday(String input) {
        return input.contains(("vendredi"));
    }

    private static boolean isTriple(String input) {
        return input.contains(Choice.TRIPLE.getName());
    }

    private static boolean isTwin(String input) {
        return input.contains(Choice.TWIN.getName());
    }

    private static boolean isNoAccomodation(String input) {
        return input.contains(Choice.NO_ACCOMMODATION.getName());
    }

    private static boolean isSingle(String input) {
        return input.contains(Choice.SINGLE.getName());
    }
}
