package lacombe;

public class Parser {

    private final String[] checkInInformations;

    public Parser(String input) {
        this.checkInInformations = parseInput(input);
    }

    private String[] parseInput(String input) {
        return input.split(";");
    }

    public Choice getChoice() {
        return Choice.getChoice(checkInInformations[5]);
    }

}
