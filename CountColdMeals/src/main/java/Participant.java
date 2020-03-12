public class Participant {

    private Integer arrivalMinute;
    public Integer arrivalHour;

    public Participant(Integer arrivalHour) {
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = 0;
    }

    public Participant(Integer arrivalHour, Integer arrivalMinute) {
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
    }


    public boolean haveAColdMeal() {
        if (arrivalHour== 21){
            return arrivalMinute > 0;
        } else {
            return arrivalHour > 21 && arrivalHour < 24;
        }
    }
}
