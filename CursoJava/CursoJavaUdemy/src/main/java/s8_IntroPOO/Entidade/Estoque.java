package s8_IntroPOO.Entidade;

public class Estoque {

    public String name;
    public double price;
    public int quantidade;

    public double totalValueInStock() {
        return price * quantidade;
    }

    public void adicionarProduto(int q) {
        quantidade += q;
    }

    public boolean removerProdutos(int r) {
        if (r > quantidade) {
            System.out.printf("a quantidade solicitada é que a quantidade atual do estoque %d%n", quantidade);
            return false;
        } else {
            quantidade -= r;
            return true;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "O produto " + name + " com preço de R$ " + String.format("%.2f", price) + " possui um total de "
                + quantidade + " produtos no estoque com valor monetário de R$ "
                + String.format("%.2f", totalValueInStock());
    }
}
