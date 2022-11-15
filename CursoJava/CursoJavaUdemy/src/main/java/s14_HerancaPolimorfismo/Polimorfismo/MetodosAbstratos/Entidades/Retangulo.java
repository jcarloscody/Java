package s14_HerancaPolimorfismo.Polimorfismo.MetodosAbstratos.Entidades;

public class Retangulo extends Forma {

    private Double largura, altura;

    public Retangulo() {
    }

    public Retangulo(Double largura, Double altura, Cores cor, String nome) {
        super(cor, nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return largura * altura;
    }

}
