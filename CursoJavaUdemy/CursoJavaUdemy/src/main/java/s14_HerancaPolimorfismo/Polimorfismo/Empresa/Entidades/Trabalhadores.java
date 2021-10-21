package s14_HerancaPolimorfismo.Polimorfismo.Empresa.Entidades;

public class Trabalhadores {
    private String nome;
    private Integer horas;
    private Double valorPorHoras;

    public Trabalhadores() {

    }

    public Trabalhadores(String nome, Integer horas, Double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public double pagamento() {
        return valorPorHoras * horas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Funcionário: " + getNome() + "       ganha R$ " + String.format("%.2f%n", pagamento());
    }
}
