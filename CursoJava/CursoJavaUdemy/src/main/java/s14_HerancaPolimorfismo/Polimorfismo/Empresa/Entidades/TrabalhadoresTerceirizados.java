package s14_HerancaPolimorfismo.Polimorfismo.Empresa.Entidades;

public class TrabalhadoresTerceirizados extends Trabalhadores {
    private Double adicionalTerceirizado;

    public TrabalhadoresTerceirizados() {
        super();
    }

    public TrabalhadoresTerceirizados(String nome, Integer horas, Double valorPorHoras, Double adicionalTerceirizado) {
        super(nome, horas, valorPorHoras);
        this.adicionalTerceirizado = adicionalTerceirizado;
    }

    @Override
    public double pagamento() {
        // TODO Auto-generated method stub
        return super.pagamento() + adicionalTerceirizado * 1.1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Funcionário: " + getNome() + " (ter) ganha R$ " + String.format("%.2f%n", pagamento());
    }
}
