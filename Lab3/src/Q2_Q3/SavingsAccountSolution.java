// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

public class SavingsAccountSolution {

    private int accountId; // account id is unique id starting at 1
    private static int nextAccount = 0;
    private static float annualInterestRate = 0f;
    private double savingsBalance;

    // Constructor

    public SavingsAccountSolution() {
        ++nextAccount;
        setAccountId(nextAccount);
    }

    public SavingsAccountSolution(double savingsBalance) {
        ++nextAccount;
        setAccountId(nextAccount);
        setSavingsBalance(savingsBalance);
    }

    // Getter and Setter

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyAnnualInterestRate(float annualInterestRate) {
        SavingsAccountSolution.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (getSavingsBalance()*getAnnualInterestRate())/12;
        setSavingsBalance(getSavingsBalance() + monthlyInterest);
    }

    // toString


    @Override
    public String toString() {
        return "SavingsAccountSolution{" +
                "accountId=" + accountId +
                ", savingsBalance=" + savingsBalance +
                "j" +
                '}';
    }
}
