import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {

    @Test
    public void aParticipantHaveAnArrivalTime(){
        Participant participant = new Participant(20);
        assertThat(participant.arrivalTime).isNotNull();
    }

    @Test
    public void ParticipantArrivedBefor20MustHaveHotMeals(){
        Participant participant = new Participant(20);
        assertThat(participant.haveAColdMeal()).isFalse();
    }

    @Test
    public void ParticipantArrivedAfter21MustHaveColdMeals(){
        Participant participant = new Participant(22);
        assertThat(participant.haveAColdMeal()).isTrue();
    }

}
