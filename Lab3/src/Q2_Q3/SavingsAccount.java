// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

public class SavingsAccount {

    private static int accountId = 1; // account id is unique id starting at 1

    private String accountNumber;
    private static float annualInterestRate;
    private double savingsBalance;
    private float monthlyInterest;

    public SavingsAccount() {
        accountNumber = "IE " + accountId++; // account number is IE + the unique id incrementing by 1
    }

    public float calculateMonthlyInterest() {
        // monatliche Zinsen berechnen
        // (Gutuhaben( balance) * annualInterestRate) / 12
        monthlyInterest = (float) ((getSavingsBalance()*annualInterestRate)/12);
        return monthlyInterest;

    }

    public static float modifyInterestRate() {
        return annualInterestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        return savingsBalance;
    }

    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static float setAnnualInterestRate(float annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
        return annualInterestRate;
    }
}

/*
To-Do:
Verwenden Sie eine statische Klassenvariable, um den jährlichen Zinssatz (annualInterestRate) für jeden der Sparer zu berechnen.
Jedes Objekt der Klasse enthält eine private Instanzvariable savingsBalance, die den Betrag angibt, den der Sparer
derzeit auf seinem Konto hat. Stellen Sie eine Methode calculateMonthlyInterest() bereit, um die monatlichen Zinsen
zu berechnen, indem Sie den Saldo (balance) mit annualInterestRate geteilt durch 12 multiplizieren
diese Zinsen sollten zu savingsBalance hinzugefügt werden. Stellen Sie eine statische Methode modifyInterestRate(),
die den Jahreszins auf einen neuen Wert setzt.
*/
