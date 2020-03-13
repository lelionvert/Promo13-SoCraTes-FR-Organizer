package lacombe;



public class CheckIn {
    private final Parser parser;

    public CheckIn(String input) {
        parser = new Parser(input);
    }

    public static boolean isArrivedOnFriday(String input) {
        return input.toLowerCase().contains(("vendredi"));
    }

    static boolean isDepartureOnSaturday(String input) {
        return input.contains(("samedi"));
    }

    public Choice getChoice() {
        return parser.getChoice();
    }
}
