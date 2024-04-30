package services;

import entities.RegisteredUsers;
import textTerminal.textRegistration;

import java.util.Scanner;

public class Registration {
    textRegistration text = new textRegistration();
    RegisteredUsers users = new RegisteredUsers();
    Scanner scanner = new Scanner(System.in);

    public void registrationOfAccount(){
        text.printText();
        if(ValidateCPF.valid(text.getCpf())){
            users.register(text);
        } else{
            System.out.println("Error Cpf!");
        }
    }
}
