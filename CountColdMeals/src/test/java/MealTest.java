import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MealTest {

    @Test
    public void oneParticipantArrivedOnTimeDoesNotHaveAColdMeal(){
        Participant participant = Participant.createParticipantHourMinuteDay(18,0,4);
        Meal meal = new Meal(participant);
        assertThat(meal.getColdMeals()).isEqualTo(0);
    }

    @Test
    public void oneParticipantArrivedNotOnTimeMustHaveAColdMeal(){
        Participant participant = Participant.createParticipantHourMinuteDay(22,0,4);
        Meal meal = new Meal(participant);
        assertThat(meal.getColdMeals()).isEqualTo(1);
    }


}
