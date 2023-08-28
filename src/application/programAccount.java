package application; 
import entities.SavingsAccount;
import entities.account;

public class programAccount {
    
    public static void main (String[] args) {

        account acc1 = new account(1001, "Alex", 1000.0);   
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        
        account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}
