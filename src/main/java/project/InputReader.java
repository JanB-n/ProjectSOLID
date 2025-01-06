package project;

import project.DTO.Parameters;

import java.util.Scanner;

public class InputReader {
    private final InputParser inputParser = new InputParser();

    private String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arguments:");
        return scanner.nextLine();
    }

    private String[] splitUserInput(String input){
        String[] parts = input.split(" ");
        if (parts.length != 3)
            throw new IllegalArgumentException("Invalid number of arguments");
        return parts;
    }

    public Parameters getParameters() {
        String input = getUserInput();
        String[] parts = splitUserInput(input);
        return inputParser.parseInput(parts);
    }

}
