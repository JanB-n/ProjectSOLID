package project.TimeZones;

public class GMT implements TimeZone{
    @Override
    public String getName(){
        return "GMT";
    }

    @Override
    public int getHourOffsetFromCET(){
        return -1;
    }

    @Override
    public int getMinuteOffsetFromCET(){
        return 0;
    }
}
