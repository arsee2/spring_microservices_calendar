package mts_rest.date;

public class CalendarTime {
    private final long id;
    private final String time;

    public CalendarTime(long id) {
        this.id = id;
        this.time = String.valueOf(java.time.LocalTime.now());
    }
    public long getId() {
        return id;
    }
    public String getTime() {
        return time;
    }
}
