package Abstraction32;

public class ATM2 implements Bank2 {
    int balance=10000;
    @Override
    public void deposit(int amount) {
        System.out.println("deposited amount: "+amount);
        balance+=amount;
        System.out.println("amount deposited successfully");
    }
    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrawn amount: "+amount);
        balance-=amount;
        System.out.println("amount withdraw successfully");
    }
    @Override
    public void checkBalance() {
        System.out.println("Account balance: "+balance);
    }
}
