package models;

public class BankAccount {
    int acc_number;
    String acc_holder;
    float balance;

    public BankAccount(int acc_number, String acc_holder, float balance) {
        this.acc_number = acc_number;
        this.acc_holder = acc_holder;
        this.balance = balance;
    }

    public int getAcc_number() {
        return acc_number;
    }

    public String getAcc_holder() {
        return acc_holder;
    }

    public float getBalance() {
        return balance;
    }

    public void setAcc_number(int acc_number) {
        this.acc_number = acc_number;
    }

    public void setAcc_holder(String acc_holder) {
        this.acc_holder = acc_holder;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.println("Amount deposited: "+amount);
        System.out.println("Current balance: "+this.balance);
    }
    public void withdraw(float amount){
        if(amount>this.balance || amount<0){
            System.out.println("Not enough amount in your acc.");
        }
        else{
            this.balance = this.balance-amount;
            System.out.println("Amount withdraw: "+ "Rs. " + amount);
            System.out.println("Current balance: "+ "Rs. " + balance);
        }
    }
}