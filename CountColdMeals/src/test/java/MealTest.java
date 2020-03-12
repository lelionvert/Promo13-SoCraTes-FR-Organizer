import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class MealTest {

    @Test
    public void oneParticipantArrivedOnTimeDoesNotHaveAColdMeal(){
        Participant participant = Participant.createParticipantHourMinuteDay(18,0,4);
        Meal meal = new Meal(Collections.singletonList(participant));
        assertThat(meal.getColdMeals()).isEqualTo(0);
    }

    @Test
    public void oneParticipantArrivedNotOnTimeMustHaveAColdMeal(){
        Participant participant = Participant.createParticipantHourMinuteDay(22,0,4);
        Meal meal = new Meal(Collections.singletonList(participant));
        assertThat(meal.getColdMeals()).isEqualTo(1);
    }

    @Test
    public void twoParticipantsArrivedBothOnTimeDoNotHaveAnyColdMeals(){
        Participant firstParticipant = Participant.createParticipantHourMinuteDay(18,0,4);
        Participant secondParticipant = Participant.createParticipantHourMinuteDay(18,0,4);
        Meal meal = new Meal(Arrays.asList(firstParticipant,secondParticipant));
        assertThat(meal.getColdMeals()).isEqualTo(0);
    }

    @Test
    public void twoParticipantsArrivedBothNotOnTimeMustHaveTwoColdMeals(){
        Participant firstParticipant = Participant.createParticipantHourMinuteDay(22,0,4);
        Participant secondParticipant = Participant.createParticipantHourMinuteDay(22,0,4);
        Meal meal = new Meal(Arrays.asList(firstParticipant,secondParticipant));
        assertThat(meal.getColdMeals()).isEqualTo(2);
    }

    @Test
    public void twoParticipantsArrivedOneBeforeAndOneAfterHaveOnlyOneColdMeal(){
        Participant firstParticipant = Participant.createParticipantHourMinuteDay(18, 0,4);
        Participant secondParticipant = Participant.createParticipantHourMinuteDay(22,0,4);
        Meal meal = new Meal(Arrays.asList(firstParticipant,secondParticipant));
        assertThat(meal.getColdMeals()).isEqualTo(1);
    }



}
