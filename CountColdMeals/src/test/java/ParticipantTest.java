import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {

    @Test
    public void aParticipantHaveAnArrivalTime(){
        Participant participant = new Participant(20);
        assertThat(participant.arrivalTime).isNotNull();
    }
}
