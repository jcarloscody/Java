package s14_HerancaPolimorfismo.Banco;

public class Conta {
    private Integer number;
    private String holder;
    protected Double balance;

    public Conta() {

    }

    public Conta(Integer number, String holder, Double balance) {
        this.balance = balance;
        this.number = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void saque(double saq) { // asd
        balance -= saq + 5.0;
    }

    public void deposito(double dep) {
        balance += dep;
    }
}
