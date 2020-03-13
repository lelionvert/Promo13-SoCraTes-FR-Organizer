package scenarios;

import lacombe.BlackBox;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceWithoutOneMealTest {

    @Test
    public void Participant_ArrivesFridayAt9_LeavesSundayAt16_ChooseTriple_AndPaid370() {
        String input = "Margaud;vendredi;9h;dimanche;16h;Triple";

        long price = BlackBox.calculatePrice(input);

        assertThat(price).isEqualTo(370);
    }

    @Test
    public void Participant_ArrivesThursdayAt22_LeavesSaturdayAt21_ChooseTwin_AndPaid470() {
        String input = "Inés;jeudi;22h;samedi;21h;Twin";

        long price = BlackBox.calculatePrice(input);

        assertThat(price).isEqualTo(470);
    }
}
