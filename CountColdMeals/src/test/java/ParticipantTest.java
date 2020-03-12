import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {

    @Test
    public void aParticipantHaveAnArrivalTime(){
        Participant participant =  Participant.createParticipantHour(20);
        assertThat(participant.arrivalHour).isNotNull();
    }

    @Test
    public void ParticipantArrivedBefor20MustHaveHotMeals(){
        Participant participant = Participant.createParticipantHour(20);
        assertThat(participant.haveAColdMeal()).isFalse();
    }

    @Test
    public void ParticipantArrivedAfter21MustHaveColdMeals(){
        Participant participant = Participant.createParticipantHour(22);
        assertThat(participant.haveAColdMeal()).isTrue();
    }

    @Test
    public void ParticipantArrivedAfter00MustNotHaveMeals(){
        Participant participant = Participant.createParticipantHour(24);
        assertThat(participant.haveAColdMeal()).isFalse();
    }

    @Test
    public void participantArrivedAt21h00MustHaveHotMeals(){
        Participant participant = Participant.createParticipantHour(21);
        assertThat(participant.haveAColdMeal()).isFalse();
    }

    @Test
    public void participantArrivedAt21h01MustHaveColdMeals(){
        Participant participant = Participant.createParticipantHourMinute(21, 1);
        assertThat(participant.haveAColdMeal()).isTrue();
    }

    @Test
    public void participantArrivedAt22hOnFridayMustHaveNoColdMeals(){
        Participant participant = Participant.createParticipantHourMinuteDay(22,0,5);
        assertThat(participant.haveAColdMeal()).isFalse();
    }


}
