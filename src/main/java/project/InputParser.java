package project;

import project.DTO.Parameters;

public class InputParser {
    int hour;
    int minute;
    int second;
    String oldTimeFormat;
    String newTimeFormat;

    private void parseTimeZones(String part1, String part2) {
        this.oldTimeFormat = part1;
        this.newTimeFormat = part2;
    }

    private void parseTime(String time) throws NumberFormatException {
            String[] HHmmss = time.split(":");
            this.hour = Integer.parseInt(HHmmss[0]);
            this.minute = Integer.parseInt(HHmmss[1]);
            this.second = Integer.parseInt(HHmmss[2]);
    }

    public Parameters parseInput(String[] parts){
        parseTimeZones(parts[1], parts[2]);
        try {
            parseTime(parts[0]);
            return new Parameters(hour, minute, second, oldTimeFormat, newTimeFormat);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid time format");
        }
        return null;
    }
}
