public class Meal {

    private Participant participant;

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
