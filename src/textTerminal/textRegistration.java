package textTerminal;

import java.util.Scanner;

public class textRegistration {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String email;
    private String password;
    private String countryOfOrigin;

    public void printText(){
        System.out.print("To register, simply fill in the details below.\n" +
                            "New users get a 30% bonus on STK points.\n\n" +
                            "Name: ");
        name = scanner.nextLine();
        System.out.print("Email: \n");
        email = scanner.nextLine();

        System.out.print("The password must be strong. (Letters, numbers, minimum 8 characters)\n" +
                            "password: ");
        password = scanner.nextLine();
        System.out.print("Country of origin: \n");
        countryOfOrigin = scanner.nextLine();
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
