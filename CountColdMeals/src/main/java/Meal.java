public class Meal {

    private int numberOfParticipants;
    private int numberOfPunctualParticipants;

    public Meal(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public Meal(int numberOfParticipants, int numberOfPunctualParticipants) {
        this.numberOfParticipants = numberOfParticipants;
        this.numberOfPunctualParticipants = numberOfPunctualParticipants;
    }


    public int getColdMeals() {
        if(numberOfParticipants == 10) {
            return numberOfParticipants - numberOfPunctualParticipants;
        }
        return numberOfParticipants;
    }


}
