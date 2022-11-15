package s10_memoria_array_listas;

public class ArrayCompraEntidade {
    private String nome;
    private double price;

    public ArrayCompraEntidade(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
