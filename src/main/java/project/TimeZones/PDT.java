package project.TimeZones;

public class PDT implements TimeZone{
    @Override
    public String getName(){
        return "PDT";
    }

    @Override
    public int getHourOffsetFromCET(){
        return -9;
    }

    @Override
    public int getMinuteOffsetFromCET(){
        return 0;
    }
}