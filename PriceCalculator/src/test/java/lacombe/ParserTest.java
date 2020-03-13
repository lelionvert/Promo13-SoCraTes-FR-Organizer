package lacombe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    public void getChoiceFromInputCaseSingle() {
        String input = "Arnaud;vendredi;21h;dimanche;16h;Single";

        Parser parser = new Parser(input);
        Choice choice = parser.getChoice();

        assertThat(choice).isEqualTo(Choice.SINGLE);
    }

    @Test
    public void getChoiceFromInputCaseTwin() {
        String input = "Léa;jeudi;22h;Samedi;16h;Twin";

        Parser parser = new Parser(input);
        Choice choice = parser.getChoice();

        assertThat(choice).isEqualTo(Choice.TWIN);
    }

    @Test
    public void getChoiceFromInputWrongCase() {
        String input = "Bob;jeudi;22h;Samedi;16h;TWIN";

        Parser parser = new Parser(input);
        Choice choice = parser.getChoice();

        assertThat(choice).isEqualTo(Choice.TWIN);
    }
}