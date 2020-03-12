public class ArrivalDate {


    public static final Integer MIDNIGHT = 24;
    private static final Integer FIRST_DAY = 4;
    private static final Integer END_OF_HOT_MEALS = 21;

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

    boolean isBetween() {
        if (! isOnTheFirstDay()) {
            return false;
        }
        return isAfterLimitTime();
    }

    private boolean isAfterLimitTime() {
        if (END_OF_HOT_MEALS.equals(hour)){
            return minute > 0;
        } else {
            return hour > END_OF_HOT_MEALS && hour < MIDNIGHT;
        }
    }

    private boolean isOnTheFirstDay() {
        return FIRST_DAY.equals(day);
    }
}
