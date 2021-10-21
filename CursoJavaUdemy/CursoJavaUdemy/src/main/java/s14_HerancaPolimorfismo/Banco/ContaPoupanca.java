package s14_HerancaPolimorfismo.Banco;

public class ContaPoupanca extends Conta {
    private Double taxaDeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer number, String holder, Double balance, Double taxaDeJuros) {
        super(number, holder, balance);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarBalanca() {
        balance += balance * taxaDeJuros;
    }

    // sobreposição ou sobrescrita - é a implementacao de um metodo de uma
    // superclasse na subclasse
    @Override
    public void saque(double saq) {
        balance -= saq;
    }
}
