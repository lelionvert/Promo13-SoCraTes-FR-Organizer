import java.util.List;

public class Meal {

    private List<Participant> listParticipants;
    private Participant participant;

    public Meal(Participant participant) {
        this.participant = participant;
    }

    public Meal(List<Participant> listParticipants) {
        this.listParticipants = listParticipants;
    }

    public int getColdMeals() {
        if (this.listParticipants != null ){
            return 0;
        }
        if (! this.participant.haveAColdMeal()){
            return 0;
        }else{
            return 1;
        }
    }


}
