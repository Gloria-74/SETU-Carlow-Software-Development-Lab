// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q2_Q3;

import java.util.ArrayList;

// Q3
public class BankCustomer {
    private String name;
    private String address;
    private ArrayList<SavingsAccount> bankAccounts = new ArrayList<SavingsAccount>();


    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ArrayList<SavingsAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<SavingsAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


/*
Erstellen Sie eine Klasse BankCustomer. Jeder BankCustomer hat einen Namen, eine Adresse und kann bis zu drei
SavingsAccounts haben. Die Konstruktormethode von BankCustomer sollte nur den Namen und die Adresse des Kunden akzeptieren.
Bieten Sie eine Methode namens addAccount, die einen SavingsAccount-Parameter akzeptiert - das BankCustomer-Objekt sollte
verfolgen, wie viele gültige SavingsAccounts bis jetzt hinzugefügt wurden.
Stellen Sie eine Methode namens balance bereit, die die gesamten Ersparnisse des BankCustomers berechnet und zurückgibt.
Bieten Sie eine Methode summary an, die jede Kontonummer und den entsprechenden Saldo ausgibt.
 */
