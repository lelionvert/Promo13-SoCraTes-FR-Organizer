public class Participant {

    public Integer arrivalTime;

    public Participant(Integer arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    public boolean haveAColdMeal() {
        return arrivalTime >= 21;
    }
}
