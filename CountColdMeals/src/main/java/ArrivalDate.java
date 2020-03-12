public class ArrivalDate {



    public static final Integer END_OF_DAY = 24;
    public static final Integer MIDNIGHT = 0;
    private static final Integer FIRST_DAY = 4;
    private static final Integer END_OF_HOT_MEALS = 21;
    public static final Integer FIRST_HOUR = 16;
    public static final Integer FIRST_MINUTE = 0;

    private Integer day;
    private Integer minute;
    private Integer hour;

    private ArrivalDate(Integer hour, Integer minute, Integer day) {
        this.hour = hour;
        this.minute = minute;
        this.day = day;
    }

    public static ArrivalDate createDefaultDate() {
        return new ArrivalDate(FIRST_HOUR, FIRST_MINUTE, FIRST_DAY);
    }

    public static ArrivalDate createDateHour(Integer hour) {
        return new ArrivalDate(hour, FIRST_MINUTE, FIRST_DAY);
    }

    public static ArrivalDate createDateHourMinute(Integer hour, Integer minute) {
        return new ArrivalDate(hour, minute, FIRST_DAY);
    }

    public static ArrivalDate createDateHourMinuteDay(Integer hour, Integer minute, Integer day) {
        return new ArrivalDate(hour,minute,day);
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

    boolean isInTheRightTime() {
        if(MIDNIGHT.equals(hour) && FIRST_MINUTE.equals(minute) && day.equals(FIRST_DAY + 1 )){
            return true;
        }
        if (! isOnTheFirstDay()) {
            return false;
        }
        return isAfterLimitTime();
    }

    private boolean isAfterLimitTime() {
        if (END_OF_HOT_MEALS.equals(hour)){
            return minute > 0;
        } else {
            return hour > END_OF_HOT_MEALS && hour < END_OF_DAY;
        }
    }

    private boolean isOnTheFirstDay() {
        return FIRST_DAY.equals(day);
    }
}
