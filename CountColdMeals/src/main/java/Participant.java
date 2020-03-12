public class Participant {

    private Integer arrivalDay;
    private Integer arrivalMinute;
    public Integer arrivalHour;


    public Participant(Integer arrivalHour) {
        this(arrivalHour, 0);
        this.arrivalDay = 4;
    }

    public Participant(Integer arrivalHour, Integer arrivalMinute) {
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.arrivalDay = 4;
    }

    public Participant(Integer arrivalHour, Integer arrivalMinute, Integer arrivalDay) {
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.arrivalDay = arrivalDay;
    }


    public boolean haveAColdMeal() {
        if(arrivalDay != 4 ){
            return false;
        }
        if (arrivalHour== 21){
            return arrivalMinute > 0;
        } else {
            return arrivalHour > 21 && arrivalHour < 24;
        }

    }
}
