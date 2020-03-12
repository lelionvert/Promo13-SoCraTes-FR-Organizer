public class Participant {

    public ArrivalDate arrivalDate;

    private Participant(Integer arrivalHour, Integer arrivalMinute, Integer arrivalDay) {
        this.arrivalDate = ArrivalDate.createDateHourMinuteDay(arrivalHour, arrivalMinute, arrivalDay);

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
        return arrivalDate.isInTheRightTime();
    }

}
