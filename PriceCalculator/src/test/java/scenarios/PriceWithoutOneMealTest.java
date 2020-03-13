package scenarios;

import lacombe.PriceCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceWithoutOneMealTest {

    @Test
    public void Participant_ArrivesFridayAt9_LeavesSundayAt16_ChooseTriple_AndPaid370() {
        String input = "Margaud;vendredi;9h;dimanche;16h;Triple";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(370);
    }

    @Test
    public void Participant_ArrivesThursdayAt22_LeavesSaturdayAt21_ChooseTwin_AndPaid470() {
        String input = "Inés;jeudi;22h;samedi;21h;Twin";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(470);
    }

    @Test
    public void Participant_ArrivesFridayAt2_LeavesSundayAt14_ChooseSingle_AndPaid570() {
        String input = "Bertrand;vendredi;2h;dimanche;14h;Single";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(570);
    }

    @Test
    public void Participant_ArrivesThursdayAt18_LeavesSaturdayAt22_ChooseNoAccommodation_AndPaid200() {
        String input = "Lea;jeudi;18h;samedi;22h;No Accommodation";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(200);
    }

    @Test
    public void Participant_ArrivesThursdayAt18_LeavesSaturdayAt21_ChooseSingle_AndPaid570() {
        String input = "Robert;jeudi;18h;samedi;21h;Single";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(570);
    }

    @Test
    public void Participant_ArrivesFridayAt9_LeavesSundayAt18_ChooseNoAccommodation_AndPaid200() {
        String input = "Jean;vendredi;9h;Dimanche;18h;No Accommodation";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(200);
    }
}
