// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

public class BankCustomerTest {

    public static void main (String[] args) {
        BankCustomer customer = new BankCustomer("Maria Maier", "Berlin");

        SavingsAccountSolution sa = new SavingsAccountSolution(2000.00);
        customer.addAccount(sa);

        SavingsAccountSolution sa2 = new SavingsAccountSolution(3000.00);
        customer.addAccount(sa2);

        System.out.println(customer);

        for (SavingsAccountSolution sav: customer.getBankAccounts()) {
            if (sav != null) {
                System.out.println("Account No: " + sav.getAccountId() + "\t" + "balance: " + sav.getSavingsBalance());
            }
        }

        System.out.println("Total balance " + customer.balance(customer.getBankAccounts()));
    }
}
