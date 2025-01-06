package project;

public class ErrorMessenger {
    String errorMessage = "";

    void add(String errorMessage) {
        this.errorMessage += errorMessage;
    }

    void printMessage() {
        System.out.println(errorMessage);
    }

    public boolean isEmpty() {
        return errorMessage.isEmpty();
    }
}
