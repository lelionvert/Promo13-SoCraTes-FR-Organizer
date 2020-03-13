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
        if (checkInInformations[5].toLowerCase().equals(Choice.SINGLE.getName().toLowerCase())) {
            return Choice.SINGLE;
        } else if (checkInInformations[5].toLowerCase().equals(Choice.NO_ACCOMMODATION.getName().toLowerCase())) {
            return Choice.NO_ACCOMMODATION;
        } else if (checkInInformations[5].toLowerCase().equals(Choice.TWIN.getName().toLowerCase())) {
            return Choice.TWIN;
        } else if (checkInInformations[5].toLowerCase().equals(Choice.TRIPLE.getName().toLowerCase())) {
            return Choice.TRIPLE;
        } else {
            return null;
        }
    }
}
