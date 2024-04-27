package services;

import textTerminal.textRegistration;

import java.util.Scanner;

public class Registration {
    textRegistration text = new textRegistration();
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String email;
    private String password;
    private String countryOfOrigin;

    public void registrationOfAccount(){
        text.printText();

    }
}
