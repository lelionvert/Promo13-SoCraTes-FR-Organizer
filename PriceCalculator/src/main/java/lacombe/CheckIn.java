package lacombe;

import static lacombe.Choice.*;

public class CheckIn {
    private final Parser parser;

    public CheckIn(String input) {
        parser = new Parser(input);
    }

    public static boolean isArrivedOnFriday(String input) {
        return input.toLowerCase().contains(("vendredi"));
    }

    static boolean isTriple(String input) {
        return input.contains(TRIPLE.getName());
    }

    static boolean isDepartureOnSaturday(String input) {
        return input.contains(("samedi"));
    }

    static boolean isTwin(String input) {
        return input.contains(TWIN.getName());
    }

    static boolean isNoAccomodation(String input) {
        return input.toLowerCase().contains(NO_ACCOMMODATION.getName().toLowerCase());
    }

    static boolean isSingle(String input) {
        return input.contains(SINGLE.getName());
    }

    public Choice getChoice() {
        return parser.getChoice();
    }
}
