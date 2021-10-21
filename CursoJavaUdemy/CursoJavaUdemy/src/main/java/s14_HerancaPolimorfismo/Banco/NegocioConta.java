package s14_HerancaPolimorfismo.Banco;

public class NegocioConta extends Conta {
    private Double limiteEmprestimo;

    public NegocioConta() {
        super();
    }

    public NegocioConta(Integer number, String holder, Double balance, Double limiteEmprestimo) {
        super(number, holder, balance);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getlimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setlimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestando(double empr) {
        if (empr <= limiteEmprestimo) {
            super.deposito(empr);
        }
    }

    /**
     * HERANÇA.. é uma relação é-um
     * 
     * generalização/especialização - aquele que herda é uma classe especifica em
     * relacao a classe generica
     * 
     * superclasse / sub
     * 
     * herança / extensão
     * 
     * herança é uma associação entre classe e não objetos.
     */
}
