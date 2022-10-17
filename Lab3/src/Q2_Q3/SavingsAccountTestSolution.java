// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

public class SavingsAccountTestSolution {

    public static void main (String[] args) {

        SavingsAccountSolution saver1 = new SavingsAccountSolution();
        saver1.setSavingsBalance(2000.00);
        SavingsAccountSolution saver2 = new SavingsAccountSolution(3000.00);

        SavingsAccountSolution.modifyAnnualInterestRate(0.04f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1);
        System.out.println(saver2);

        SavingsAccountSolution.modifyAnnualInterestRate(0.05f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1);
        System.out.println(saver2);
    }
}
