package project.TimeZones;

public class PDT implements TimeZone{
    @Override
    public String getName(){
        return "PDT";
    }

    @Override
    public int getOffsetFromCET(){
        return -9;
    }
}