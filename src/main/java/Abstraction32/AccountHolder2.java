package Abstraction32;

public class AccountHolder2 extends ATM2 {
    public static void main(String[] args) {
        Bank2 acc =new AccountHolder2();
        acc.checkBalance();
         System.out.println("------------------------------");
        acc.deposit(4000);
        acc.checkBalance();
        System.out.println("------------------------------");
        acc.withdraw(2000);
        acc.checkBalance();
        System.out.println("------------------------------");
    }
}
