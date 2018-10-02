import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Determine the type of the account.
     */
    public enum BankAccountType {
        /**
         * this is a checking account.
         */
        CHECKINGS,
        /**
         * this is a saving account.
         */
        SAVINGS,
        /**
         * this is a student account.
         */
        STUDENT,
        /**
         * This is a workplace account.
         */
        WORKPLACE
    }

    /**
     * the number for the bank account.
     */
    private int accountNumber = 0;
    /**
     * the type of the account.
     */
    private BankAccountType accountType;
    /**
     * the balance in the account.
     */
    private double accountBalance;
    /**
     * The name of the account owner.
     */
    private String ownerName;
    /**
     * the interest rate of the account.
     */
    private double interestRate;
    /**
     * the interest that has been earned by the account.
     */
    private double interestEarned;

    /**
     * The constructor of the account.
     * @param name name of the owner.
     * @param accountCategory the type of the account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountNumber++;
        accountBalance = 0;
        interestEarned = 0;
        interestRate = 0;
    }

    /**
     * set account number.
     * @param n new account number
     */
    public void setAccountNumber(final int n) {
        accountNumber = n;
    }
}
