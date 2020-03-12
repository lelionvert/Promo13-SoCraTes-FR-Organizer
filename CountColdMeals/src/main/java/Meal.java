public class Meal {

    private int participants;
    private int punctualParticipants;


    private Participant participant;

    public Meal(int participants) {
        this.participants = participants;
        this.punctualParticipants = 0;
    }

    public Meal(int participants, int punctualParticipants) {
        this.participants = participants;
        this.punctualParticipants = punctualParticipants;
    }

    public Meal(Participant participant) {
        this.participant = participant;
    }


    public int getColdMeals() {
        if (! this.participant.haveAColdMeal()){
            return 0;
        }else{
            return 1;
        }
    }


}
