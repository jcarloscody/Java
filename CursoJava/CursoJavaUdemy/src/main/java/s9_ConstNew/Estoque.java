package s9_ConstNew;

public class Estoque {

    public String name;
    public double price;
    public int quantidade;

    public Estoque() {// construtor padrão

    }

    public Estoque(String name, double price, int quantidade) {
        /**
         * é uma operacao especial da classe, que executa no momento da instanciação do
         * objeto
         * 
         * é possivel ter mais de um construtor na classe
         * 
         * ele inicia os valores dos atributos
         * 
         * obriga que o objeto receba os dados no memento da instanciação
         */
        this.name = name;
        /**
         * this é uma referencia para o proprio objeto
         * 
         * diferencia os atributos de variaveis locais
         * 
         * ela passa o proprio objeto como argumento na chamada de um metodo ou
         * construtor
         */
        this.price = price;
        this.quantidade = quantidade;
    }

    public Estoque(String name, double price) {// segundo construtor com dois parametros
        this.price = price;
        this.name = name;
        this.quantidade = 0;
    }

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
