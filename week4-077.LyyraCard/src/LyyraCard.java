/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        String s = "The card has " + this.balance + " euros";
        return s;
    }

    public void payEconomical() {
        // write code here
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        } else if (this.balance + amount <= 150.00) {
            this.balance += amount;
        } else if (this.balance + amount > 150.00) {
            this.balance = 150.00;
        }
    }
}
