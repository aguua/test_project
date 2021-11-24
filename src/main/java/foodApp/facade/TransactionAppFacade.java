package foodApp.facade;

public class TransactionAppFacade {
    private TransactionApp transactionApp;
    private BankSystem bankSystem;

    public TransactionAppFacade() {
        transactionApp = new TransactionApp();
        bankSystem = new BankSystem();
    }

    public boolean makePayment() {
        transactionApp.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
             return transactionApp.makePayment();
        }
        else return false;
    }
}
