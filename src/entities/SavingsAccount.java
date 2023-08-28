package entities;

public class SavingsAccount extends account {

    private Double interestRate; //taxa de juros
    
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);         //chama o construtor da superclasse
        this.interestRate = interestRate;       //inicializa o atributo da subclasse
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) { //não pode ser alterado
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate; //atualiza o saldo com base na taxa de juros
    }

    @Override //sobrescreve o método withdraw da superclasse
    public void withdraw(double amount) {
        balance -= amount;
    }
}
