package project.TimeZones;

public class GMT implements TimeZone{
    @Override
    public String getName(){
        return "GMT";
    }

    @Override
    public int getOffsetFromCET(){
        return -1;
    }
}
