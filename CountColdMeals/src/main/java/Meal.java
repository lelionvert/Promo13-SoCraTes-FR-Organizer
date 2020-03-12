import java.util.List;

public class Meal {

    private List<Participant> listParticipants;
    private Integer countOfColdMeals;

    public Meal(List<Participant> listParticipants) {
        this.listParticipants = listParticipants;
        this.countOfColdMeals = 0;
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
