// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

import java.util.ArrayList;

public class SavingsAccountTest {
    public static void main (String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        // following 2 lines to print out if account balance is correct
        System.out.println("Saver 1 owns EUR " + saver1.getSavingsBalance());
        System.out.println("Saver 2 owns EUR " + saver2.getSavingsBalance());

        // following 2 lines to see if the number counts by 1
        System.out.println(saver1.getAccountNumber());
        System.out.println(saver2.getAccountNumber());

        SavingsAccount.setAnnualInterestRate((float) 0.04);

        System.out.println(saver1.calculateMonthlyInterest());
        //System.out.println(saver2.calculateMonthlyInterest());

        System.out.println(saver1.setSavingsBalance(2000)*(1+0.04)); // calculating monthly interest saver 1
        System.out.println(saver2.setSavingsBalance(3000)*(1+0.04)); // calculating monthly interest saver 2

        BankCustomer customer1 = new BankCustomer("Maria Maier", "Musteradresse 1");
        BankCustomer customer2 = new BankCustomer("Max Sampler", "Samplestreet 1");
    }

}

/*
To-Do: Treiberprogramm: Schreiben Sie ein Treiberprogramm, um die Klasse SavingsAccount zu testen.
Instanziieren Sie zwei verschiedene savingsAccount-Objekte, saver1 und saver2, mit Guthaben von €2000,00 und €3000,00.
Setzen Sie annualInterestRate auf 4%, dann berechnen Sie die monatlichen Zinsen und drucken Sie die neuen Salden für
jeden Sparer aus.
Setzen Sie dann den jährlichen Zinssatz auf 5% und berechnen Sie die Zinsen für den nächsten Monat und drucken Sie die
neuen Salden für jeden der Sparer aus.
*/
