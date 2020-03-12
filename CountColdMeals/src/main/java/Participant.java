public class Participant {

    private Integer arrivalDay;
    private Integer arrivalMinute;
    public Integer arrivalHour;


    private Participant(Integer arrivalHour, Integer arrivalMinute, Integer arrivalDay) {
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.arrivalDay = arrivalDay;
    }

    public static Participant createParticipantHour(Integer arrivalHour){
       return new Participant(arrivalHour, 0, 4);
    }

    public static Participant createParticipantHourMinute(Integer arrivalHour, Integer arrivalMinute){
        return new Participant(arrivalHour, arrivalMinute, 4);
    }

    public static Participant createParticipantHourMinuteDay(Integer arrivalHour, Integer arrivalMinute, Integer arrivalDay){
        return new Participant(arrivalHour, arrivalMinute, arrivalDay);
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
