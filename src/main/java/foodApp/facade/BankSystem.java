package foodApp.facade;

class BankSystem {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    boolean validatePin() {
        System.out.println(String.format(
                "%s\tValid PIN.%s",
                ANSI_GREEN, ANSI_RESET));
        return true;
    }

    boolean validateTransaction() {
        System.out.println(String.format(
                "%s\tFinished transaction.%s",
                ANSI_GREEN, ANSI_RESET));
        return true;
    }
}
