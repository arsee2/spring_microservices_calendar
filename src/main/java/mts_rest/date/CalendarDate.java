package mts_rest.date;

public class CalendarDate {
    private final long id;
    private final String date;

    public CalendarDate(long id) {
        this.id = id;
        this.date =  String.valueOf(java.time.LocalDate.now());
    }


    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }
}
