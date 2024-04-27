import services.ValidateCPF;
import textTerminal.textLoginOrRegistration;
import textTerminal.textWelcomeSTK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        textWelcomeSTK welcome = new textWelcomeSTK();
        textLoginOrRegistration welcome1 = new textLoginOrRegistration();
        ValidateCPF validate = new ValidateCPF();
        welcome.printText();
        System.out.print("CPF: \n");
        String cpf = scanner.nextLine();
        System.out.print("O CPF é valido? " + validate.valid(cpf));
    }
}