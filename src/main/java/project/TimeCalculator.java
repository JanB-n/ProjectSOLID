package project;

public class TimeCalculator {
    public int calculateNewHour(int hour, int offset) {
        if (hour + offset < 0)
            return 24 + hour + offset;
        if (hour + offset > 24)
            return (hour + offset) % 24;
        return hour + offset;
    }

    public int calculateNewMinute(int minute, int offset) {
        if (minute + offset < 0)
            return 60 + minute + offset;
        if (minute + offset > 60)
            return (minute + offset) % 60;
        return minute + offset;
    }
}
