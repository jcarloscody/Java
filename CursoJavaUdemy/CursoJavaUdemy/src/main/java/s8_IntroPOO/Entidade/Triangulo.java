package s8_IntroPOO.Entidade;

public class Triangulo {
    public double a;
    public double b;
    public double c;
    public String nome;

    public Triangulo(String nome) {
        this.nome = nome;
    }

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void OMaior(Triangulo t) {
        if (area() > t.area()) {
            System.out.println("O Triangulo " + nome + " é maior que " + t.nome);
        } else if (area() < t.area()) {
            System.out.println("O Triangulo " + nome + " é menor que " + t.nome);
        } else {
            System.out.println("O Triangulo " + nome + " é igual a " + t.nome);
        }
    }
}
