public class Participant {

    public Integer arrivalTime;

    public Participant(Integer arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    public boolean haveAColdMeal() {
        if(arrivalTime < 21)
            return false;
        return true;
    }
}
