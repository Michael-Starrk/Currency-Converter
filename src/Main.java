import textTerminal.textLoginOrRegistration;
import textTerminal.textWelcomeSTK;

public class Main {
    public static void main(String[] args) {
        textWelcomeSTK welcome = new textWelcomeSTK();
        textLoginOrRegistration welcome1 = new textLoginOrRegistration();
        welcome.printText();
        welcome1.printText();
    }
}