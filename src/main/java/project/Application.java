package project;

import project.DTO.Parameters;

public class Application {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        InputValidator inputValidator = new InputValidator();
        TimeConverter timeConverter = new TimeConverter();
        while (true) {
            Parameters parameters = inputReader.getParameters();
            boolean validParams = inputValidator.validate(parameters);
            if (validParams)
                timeConverter.convert(parameters);
        }
    }
}