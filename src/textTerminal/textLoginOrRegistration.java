package textTerminal;

import java.util.Scanner;

public class textLoginOrRegistration {
    Scanner scanner = new Scanner(System.in);

    private Integer choice;

    public void printText(){
        System.out.println(this.toString());
        choice = scanner.nextInt();
        scanner.close();
    }

    public Integer getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return "Do you already have an account with us or would you like to register?\n" +
                "(1) for Login | | (2) to Register";
    }
}
