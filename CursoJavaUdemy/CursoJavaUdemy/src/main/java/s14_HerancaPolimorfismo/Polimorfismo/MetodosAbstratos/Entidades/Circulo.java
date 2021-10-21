package s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades;

public class Circulo extends Forma {
    private Double radius;
    // private String nome;

    public Circulo() {
    }

    public Circulo(Double radius, Cores cor, String nome) {
        super(cor, nome);
        this.radius = radius;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }
}
