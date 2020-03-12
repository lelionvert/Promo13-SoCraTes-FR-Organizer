public class ArrivalDate {


    private Integer day;
    private Integer minute;
    private Integer hour;

    public ArrivalDate(Integer hour, Integer minute, Integer day) {
        this.hour = hour;
        this.minute = minute;
        this.day = day;
    }

    public ArrivalDate() {
        this.hour = 16;
        this.minute = 0;
        this.day = 4;
    }


    public Integer getHour() {
        return this.hour;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public Integer getDay() {
        return this.day;
    }
}
