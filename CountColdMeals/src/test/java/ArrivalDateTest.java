import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrivalDateTest {

    @Test
    public void dateInstanceMustBeDifferentFromNull(){
        ArrivalDate arrivalDate = new ArrivalDate();
        assertThat(arrivalDate).isNotNull();
    }

    @Test
    public void dateInstanceHaveHourMinuteAndDayByDefault(){
        ArrivalDate arrivalDate = new ArrivalDate();
        assertThat(arrivalDate.getHour()).isNotNull();
        assertThat(arrivalDate.getMinute()).isNotNull();
        assertThat(arrivalDate.getDay()).isNotNull();
    }

}
