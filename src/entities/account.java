package entities;

public class account {
    
    private Integer number; 
    private String holder;
    protected Double balance; //Só pode ser acessado pela própria classe account

    public account() {
    }

    public account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    } // saque

    public void deposit(double amount){
        balance += amount;
    } // deposito

}
