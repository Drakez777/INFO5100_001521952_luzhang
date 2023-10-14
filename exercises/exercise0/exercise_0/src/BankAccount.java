public class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;
    String accountType;
    double interestRate;
    String openedDate;
    boolean isActive;
    String uniqueName;
    public BankAccount(int accountNumber, String accountHolder, double balance, String accountType, double interestRate,   String openedDate, String uniqueName) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.openedDate = openedDate;
        this.isActive = true;
        this.uniqueName = uniqueName;
        System.out.println("Bank Account " + uniqueName + " created.");
    }


    void deposit(){}
    void withdraw(){}
    void check_balance(){}









    class DebitCard{
        String cardNumber;
        String cardHolder;
        String expirationDate;
        int securityCode;
        double balance;
        boolean isActivated;
        boolean isBlocked;
        String uniqueName;

        public DebitCard(String cardNumber, String cardHolder, String expirationDate, int securityCode, String uniqueName) {
            this.cardNumber = cardNumber;
            this.cardHolder = cardHolder;
            this.expirationDate = expirationDate;
            this.securityCode = securityCode;
            this.balance = 0.0;
            this.isActivated = false;
            this.isBlocked = false;
            this.uniqueName = uniqueName;
            System.out.println("Debit Card " + uniqueName + " created.");
        }

        public void makePurchase(double amount) {
            // Method to simulate making a purchase with the debit card
        }

        public void reportLost() {
            // Method to report the debit card as lost
        }

        public void activateCard() {
            // Method to activate the debit card
        }

    }
    class CreditCard{String cardNumber;
        String cardHolder;
        String expirationDate;
        int creditLimit;
        double balance;
        boolean isActivated;
        String uniqueName;

        public CreditCard(String cardNumber, String cardHolder, String expirationDate, int creditLimit, String uniqueName) {
            this.cardNumber = cardNumber;
            this.cardHolder = cardHolder;
            this.expirationDate = expirationDate;
            this.creditLimit = creditLimit;
            this.balance = 0.0;
            this.isActivated = false;
            this.uniqueName = uniqueName;
            System.out.println("Credit Card " + uniqueName + " created.");
        }

        public void makePurchase(double amount) {
            // Method to simulate making a purchase with the credit card
        }

        public void increaseLimit(int newLimit) {
            // Method to request a credit limit increase
        }

        public void checkStatement() {
            // Method to check the credit card statement
        }
    }
}


