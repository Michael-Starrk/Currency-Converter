package textTerminal;

public class textWelcome {
    @Override
    public String toString() {
        return "*******************************************************************\n" +
                "Welcome to STK Currency Exchange. \n" +
                "Do you already have an account with us or would you like to register?\n" +
                "*******************************************************************";
    }

    public void printText(){
        System.out.println(this.toString());
    }
}
