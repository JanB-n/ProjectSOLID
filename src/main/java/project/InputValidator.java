package project;

import project.DTO.Parameters;

public class InputValidator {
    private final TimeZoneManager timeZoneManager;
    private ErrorMessenger errorMessenger;

    InputValidator(TimeZoneManager timeZoneManager) {
        this.timeZoneManager = timeZoneManager;
    }

    private void validateTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            errorMessenger.add("Hour must be between 0 and 23.\n");
        }
        if (minute < 0 || minute > 59) {
            errorMessenger.add("Minute must be between 0 and 59.\n");
        }
        if (second < 0 || second > 59) {
            errorMessenger.add("Second must be between 0 and 59.\n");
        }
    }

    private void validateTimeZone(String oldTimeZone, String newTimeZone) {
        if (timeZoneManager.getTimeZone(oldTimeZone) == null) {
            errorMessenger.add("TimeZone " + oldTimeZone + " not found.\n");
        }
        if (timeZoneManager.getTimeZone(newTimeZone) == null) {
            errorMessenger.add("TimeZone " + newTimeZone + " not found.\n");
        }
    }

    private boolean checkIfNull(Parameters parameters) {
        return parameters == null;
    }

    public boolean validate(Parameters parameters) {
        if(checkIfNull(parameters))
            return false;
        errorMessenger = new ErrorMessenger();
        int hour = parameters.getHour();
        int minute = parameters.getMinute();
        int second = parameters.getSecond();
        String oldTimeZone = parameters.getOldTimeZone();
        String newTimeZone = parameters.getNewTimeZone();

        validateTime(hour, minute, second);
        validateTimeZone(oldTimeZone, newTimeZone);

        if (errorMessenger.isEmpty()) {
            return true;
        }
        else{
            printErrors();
            return false;
        }
    }

    private void printErrors(){
        System.out.println("Couldn't process your request. Reasons:");
        errorMessenger.printMessage();
    }
}
