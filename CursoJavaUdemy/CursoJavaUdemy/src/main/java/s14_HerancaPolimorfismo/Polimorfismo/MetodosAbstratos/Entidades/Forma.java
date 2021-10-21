package s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades;

public abstract class Forma {
    private Cores cor;
    private String nome;

    public Forma() {

    }

    public Forma(Cores cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double area();
}
