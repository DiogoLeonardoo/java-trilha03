package application;
import entities.SavingsAccount;
import entities.BusinessAccount;
import entities.account;

public class ProgramSavings {

    public static void main(String [] args) {

        account acc = new account (1001,"Alex",1000.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",4440.0,500.0);
   
        // UPCASTING

        account acc1 = bacc;
        account acc2 = new BusinessAccount(1003,"Bob",1000.0,0.01);
        account acc3 = new SavingsAccount(1004,"Anna",1000.0,0.01);
        
        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
    }
}
