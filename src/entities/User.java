package entities;

import textTerminal.textRegistration;

public class User {

    private String name;
    private String email;
    private String password;
    private String cpf;
    private String countryOfOrigin;

    public User(){
    }
    public User(String name, String email, String cpf, String password, String countryOfOrigin) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.countryOfOrigin = countryOfOrigin;
    }

    public User(textRegistration text){
        this.name = text.getName();
        this.email = text.getEmail();
        this.cpf = text.getCpf();
        this.password = text.getPassword();
        this.countryOfOrigin = text.getCountryOfOrigin();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
