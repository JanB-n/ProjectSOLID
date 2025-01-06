package project.DTO;

public class Parameters {

    private int hour;
    private int minute;
    private int second;

    private String oldTimeZone;
    private String newTimeZone;

    public Parameters(int hour, int minute, int second, String oldTimeZone, String newTimeZone) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.oldTimeZone = oldTimeZone;
        this.newTimeZone = newTimeZone;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getOldTimeZone() {
        return oldTimeZone;
    }

    public String getNewTimeZone() {
        return newTimeZone;
    }

}
