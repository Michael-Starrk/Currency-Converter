import services.Registration;
import services.ValidateCPF;
import textTerminal.textLoginOrRegistration;
import textTerminal.textWelcomeSTK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        textWelcomeSTK welcome = new textWelcomeSTK();
        Registration registration = new Registration();

        welcome.printText();
        registration.registrationOfAccount();
    }
}