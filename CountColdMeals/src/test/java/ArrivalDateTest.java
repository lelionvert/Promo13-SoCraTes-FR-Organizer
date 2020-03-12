import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrivalDateTest {

    @Test
    public void dateInstanceHaveHourMinuteAndDayByDefault(){
        ArrivalDate arrivalDate = ArrivalDate.createDefaultDate();
        assertThat(arrivalDate.getHour()).isNotNull();
        assertThat(arrivalDate.getMinute()).isNotNull();
        assertThat(arrivalDate.getDay()).isNotNull();
    }

    @Test
    public void dateInstanceIsCreatedWithHourOnly(){
        ArrivalDate arrivalDate = ArrivalDate.createDateHour(20);
        assertThat(arrivalDate.getHour()).isEqualTo(20);
        assertThat(arrivalDate.getMinute()).isNotNull();
        assertThat(arrivalDate.getDay()).isNotNull();
    }

    @Test
    public void dateInstanceIsCreatedWithHourAndMinute(){
        ArrivalDate arrivalDate = ArrivalDate.createDateHourMinute(20, 45);
        assertThat(arrivalDate.getHour()).isEqualTo(20);
        assertThat(arrivalDate.getMinute()).isEqualTo(45);
        assertThat(arrivalDate.getDay()).isNotNull();
    }

    @Test
    public void dateInstanceIsCreatedWithHourAndMinuteAndDay(){
        ArrivalDate arrivalDate = ArrivalDate.createDateHourMinuteDay(20, 45, 4);
        assertThat(arrivalDate.getHour()).isEqualTo(20);
        assertThat(arrivalDate.getMinute()).isEqualTo(45);
        assertThat(arrivalDate.getDay()).isEqualTo(4);
    }


}
