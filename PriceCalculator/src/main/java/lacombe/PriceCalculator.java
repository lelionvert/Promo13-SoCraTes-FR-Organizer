package lacombe;

import static lacombe.Choice.*;

public class PriceCalculator {

    public static final int MEAL_PRICE = 40;

    public static long calculatePrice(String input) {
        CheckIn checkIn = new CheckIn(input);
        Choice choice = checkIn.getChoice();
        if (CheckIn.isSingle(input)) {
            return calculatePriceFor(input, SINGLE);
        } else if (CheckIn.isNoAccomodation(input)) {
            return calculatePriceFor(input, NO_ACCOMMODATION);
        } else if (CheckIn.isTwin(input)) {
            return calculatePriceFor(input, TWIN);
        } else if (CheckIn.isTriple(input)) {
            return calculatePriceFor(input, TRIPLE);
        } else {
            return 0;
        }
    }

    private static long calculatePriceFor(String input, Choice choice) {
        if (CheckIn.isArrivedOnFriday(input) || CheckIn.isDepartureOnSaturday(input)) {
            return choice.getPrice() - MEAL_PRICE;
        }
        return choice.getPrice();
    }

}
