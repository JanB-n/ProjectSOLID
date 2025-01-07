package project;

import project.DTO.Parameters;

public class Application {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        InputReader inputReader = new InputReader(inputParser);

        TimeZoneManager timeZoneManager = new TimeZoneManager();
        InputValidator inputValidator = new InputValidator(timeZoneManager);
        TimeConverter timeConverter = new TimeConverter(timeZoneManager);

        ResponsePrinter responsePrinter = new ResponsePrinter();

        while (true) {
            inputReader.loadUserInput();

            if (inputReader.checkForExit())
                break;

            try {
                Parameters parameters = inputReader.getParameters();
                boolean validParams = inputValidator.validate(parameters);
                if (validParams) {
                    Parameters newTime = timeConverter.convert(parameters);
                    responsePrinter.printTime(newTime);
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println("Bad argument format");
            }

        }
    }
}