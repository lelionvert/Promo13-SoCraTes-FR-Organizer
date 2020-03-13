package lacombe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class ChoiceTest {

    @ParameterizedTest
    @ValueSource(strings = {"TWIN", "Twin", "twin"})
    void getChoice_testOK(String strChoice) {
        Choice choice = Choice.getChoice(strChoice);

        assertThat(choice).isEqualTo(Choice.TWIN);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NO ACCOMMODATION", "no accommodation", "No Accommodation"})
    void getChoice_OtherTestOK(String strChoice) {
        Choice choice = Choice.getChoice(strChoice);

        assertThat(choice).isEqualTo(Choice.NO_ACCOMMODATION);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NO_ACCOMMODATION", "Toto", "riendutout"})
    void getChoice_testKO(String strChoice) {
        Choice choice = Choice.getChoice(strChoice);

        assertThat(choice).isEqualTo(Choice.DEFAULT);
    }
}