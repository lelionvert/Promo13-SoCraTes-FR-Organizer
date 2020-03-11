public class Meal {

    private int participants;
    private int punctualParticipants;

    public Meal(int participants) {
        this.participants = participants;
        this.punctualParticipants = 0;
    }

    public Meal(int participants, int punctualParticipants) {
        this.participants = participants;
        this.punctualParticipants = punctualParticipants;
    }


    public int getColdMeals() {
        if(participants == 10) {
            return participants - punctualParticipants;
        }
        return participants;
    }


}
