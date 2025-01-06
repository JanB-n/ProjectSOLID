package project;

import project.TimeZones.GMT;
import project.TimeZones.PDT;
import project.TimeZones.TimeZone;

import java.util.ArrayList;
import java.util.List;

public class TimeZoneManager {
    private final List<TimeZone> timeZones = new ArrayList<TimeZone>();
    TimeZoneManager() {
        timeZones.add(new GMT());
        timeZones.add(new PDT());
    }

    public TimeZone getTimeZone(String timeZone){
        for (TimeZone tz : timeZones) {
            if (tz.getName().equals(timeZone)) {
                return tz;
            }
        }
        return null;
    }
}
