package textTerminal;

public class textWelcomeSTK {
    public void printText(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "*******************************************************************\n" +
                "Welcome to STK Currency Exchange. \n" +
                "Connecting you, to the world.\n";
    }
}
