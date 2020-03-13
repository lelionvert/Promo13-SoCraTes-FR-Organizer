package lacombe;

public class PriceCalculator {

    public static final int MEAL_PRICE = 40;

    public static long calculatePrice(String input) {
        Parser parser = new Parser(input);
        Choice choice = parser.getChoice();
        if (CheckIn.isArrivedOnFriday(input) || CheckIn.isDepartureOnSaturday(input)) {
            return choice.getPrice() - MEAL_PRICE;
        }
        return choice.getPrice();
    }

}
