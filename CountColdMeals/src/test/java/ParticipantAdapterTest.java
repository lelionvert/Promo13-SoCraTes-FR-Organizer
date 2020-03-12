import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantAdapterTest {

    @Test
    public void participantAdapterIsNotNull(){

        ParticipantAdapter adapter = new ParticipantAdapter();
        assertThat(adapter).isNotNull();
    }
}
