package project;

import project.DTO.Parameters;
import project.TimeZones.TimeZone;

public class TimeConverter {
    private final TimeZoneManager timeZoneManager;
    private final TimeCalculator timeCalculator = new TimeCalculator();


    TimeConverter(TimeZoneManager timeZoneManager) {
        this.timeZoneManager = timeZoneManager;
    }

    public Parameters convert(Parameters parameters) {
        String oldTZ = parameters.getOldTimeZone();
        String newTZ = parameters.getNewTimeZone();

        TimeZone oldTimeZone = timeZoneManager.getTimeZone(oldTZ);
        TimeZone newTimeZone = timeZoneManager.getTimeZone(newTZ);

        int hour = parameters.getHour();
        int minute = parameters.getMinute();
        int second = parameters.getSecond();

        int hourOffset = newTimeZone.getHourOffsetFromCET() - oldTimeZone.getHourOffsetFromCET();
        int minuteOffset = newTimeZone.getMinuteOffsetFromCET() - oldTimeZone.getMinuteOffsetFromCET();

        int newHour = timeCalculator.calculateNewHour(hour, hourOffset);
        int newMinute = timeCalculator.calculateNewMinute(minute, minuteOffset);

        return new Parameters(newHour, newMinute, second, oldTZ, newTZ);
    }

}
