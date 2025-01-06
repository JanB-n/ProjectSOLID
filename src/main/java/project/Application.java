package project;

import project.DTO.Parameters;

public class Application {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        TimeZoneManager timeZoneManager = new TimeZoneManager();
        InputReader inputReader = new InputReader(inputParser);
        InputValidator inputValidator = new InputValidator(timeZoneManager);
        TimeConverter timeConverter = new TimeConverter(timeZoneManager);
        ResponsePrinter responsePrinter = new ResponsePrinter();
        while (true) {
            inputReader.loadUserInput();
            if (inputReader.checkForExit())
                break;
            Parameters parameters = inputReader.getParameters();
            boolean validParams = inputValidator.validate(parameters);
            if (validParams) {
                Parameters newTime = timeConverter.convert(parameters);
                responsePrinter.printTime(newTime);
            }
        }
    }
}