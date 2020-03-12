import java.util.List;

public class Meal {

    private List<Participant> listParticipants;
    private static Integer countOfColdMeals;

    public Meal(List<Participant> listParticipants) {
        this.listParticipants = listParticipants;
        countOfColdMeals = 0;
    }

    public int getColdMeals() {
        if (this.listParticipants != null) {
            for (Participant participant : this.listParticipants) {
                if (participant.haveAColdMeal()) {
                    countOfColdMeals++;
                }
            }
        }
        return countOfColdMeals;
    }


}
