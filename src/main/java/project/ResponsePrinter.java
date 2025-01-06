package project;

import project.DTO.Parameters;

public class ResponsePrinter {
    void printTime(Parameters parameters) {
        System.out.println(parameters.getHour() + ":" + parameters.getMinute() + ":" + parameters.getSecond() + " " + parameters.getNewTimeZone());
    }
}
