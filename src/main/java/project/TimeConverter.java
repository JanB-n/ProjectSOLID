package project;

import project.DTO.Parameters;
import project.TimeZones.TimeZone;

public class TimeConverter {
    private final TimeZoneManager timeZoneManager = new TimeZoneManager();

    public void convert(Parameters parameters) {
        String oldTZ = parameters.getOldTimeZone();
        String newTZ = parameters.getNewTimeZone();

        TimeZone oldTimeZone = timeZoneManager.getTimeZone(oldTZ);
        TimeZone newTimeZone = timeZoneManager.getTimeZone(newTZ);

        int offset = newTimeZone.getOffsetFromCET() - oldTimeZone.getOffsetFromCET();
        printResponse(parameters.getHour(), parameters.getMinute(), parameters.getSecond(), offset, newTZ);
    }

    void printResponse(int hour, int minute, int second, int offset, String newTZ) {
        int newHour = (hour + offset) % 24;
        System.out.println(newHour + ":" + minute + ":" + second + " " + newTZ);
    }
}
