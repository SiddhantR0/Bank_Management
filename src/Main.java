import models.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(11,"Siddhant",50000);
        acc1.withdraw(3000);
    }
}