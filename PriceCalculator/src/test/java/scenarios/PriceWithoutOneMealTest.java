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

    @Test
    public void Participant_ArrivesFridayAt2_LeavesSundayAt14_ChooseSingle_AndPaid570() {
        String input = "Bertrand;vendredi;2h;dimanche;14h;Single";

        long price = BlackBox.calculatePrice(input);

        assertThat(price).isEqualTo(570);
    }

    @Test
    public void Participant_ArrivesThursdayAt18_LeavesSaturdayAt22_ChooseNoAccommodation_AndPaid200() {
        String input = "Lea;jeudi;18h;samedi;22h;No Accommodation";

        long price = BlackBox.calculatePrice(input);

        assertThat(price).isEqualTo(200);
    }

}
