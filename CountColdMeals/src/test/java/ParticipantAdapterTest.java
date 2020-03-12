import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantAdapterTest {


    @Test
    public void participantAdapterIsAbleToReadAFile(){
        String csvContent = "philippe dupond; thursday; 18h00; Sunday; 16h00";
        ParticipantAdapter adapter = new ParticipantAdapter(csvContent);
        assertThat(adapter.csvContent).isEqualTo(csvContent);
    }
}
