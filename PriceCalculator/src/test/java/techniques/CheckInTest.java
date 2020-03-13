package techniques;

import lacombe.CheckIn;
import lacombe.Choice;
import lacombe.PriceCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckInTest {

    @Test
    public void Choice_InUpperCase(){
        String input = "Arnaud;jeudi;21h;dimanche;16h;NO ACCOMMODATION";

        long price = PriceCalculator.calculatePrice(input);

        assertThat(price).isEqualTo(240);
    }

    @Test
    public void checkArrivalDateInUpperCase() {
        String input = "Arnaud;VENDREDI;21h;dimanche;16h;NO ACCOMMODATION";

        boolean arrivedOnFriday = CheckIn.isArrivedOnFriday(input);

        assertThat(arrivedOnFriday).isEqualTo(true);

    }

    @Test
    public void getChoiceFromInput() {
        String input = "Arnaud;vendredi;21h;dimanche;16h;No Accommodation";

        CheckIn checkIn = new CheckIn(input);
        Choice choice = checkIn.getChoice();

        assertThat(choice).isEqualTo(Choice.NO_ACCOMMODATION);
    }

    @Test
    public void getChoiceSingleFromInput() {
        String input = "Arnaud;vendredi;21h;dimanche;16h;Single";

        CheckIn checkIn = new CheckIn(input);
        Choice choice = checkIn.getChoice();

        assertThat(choice).isEqualTo(Choice.SINGLE);
    }
}
