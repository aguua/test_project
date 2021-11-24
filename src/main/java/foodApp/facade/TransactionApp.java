package foodApp.facade;

class TransactionApp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    void enterPin() {
        System.out.println(String.format(
                "%s\tEntered PIN.%s",
                ANSI_GREEN, ANSI_RESET));
    }

    boolean makePayment() {
        System.out.println(String.format(
                "%s\tThe payment has been made.%s",
                ANSI_GREEN, ANSI_RESET));
        return true;
    }
}
