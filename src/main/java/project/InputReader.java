package project;

import project.DTO.Parameters;

import java.util.Scanner;

public class InputReader {
    private final InputParser inputParser;
    String input;
    private boolean exit = false;

    InputReader(InputParser inputParser) {
        this.inputParser = inputParser;
    }

    private String[] splitUserInput(String input){
        String[] parts = input.split(" ");
        if (parts.length != 3)
            throw new IllegalArgumentException("Invalid number of arguments");
        return parts;
    }

    public boolean checkForExit(){
        return input.equals("exit");
    }

    public void loadUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arguments:");
        input =  scanner.nextLine();
    }

    public Parameters getParameters() {
        String[] parts = splitUserInput(input);
        return inputParser.parseInput(parts);
    }

}
