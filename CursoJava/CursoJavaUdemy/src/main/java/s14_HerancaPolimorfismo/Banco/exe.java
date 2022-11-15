package s14_HerancaPolimorfismo.Banco;

public class exe {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "josue", 0.0);

        NegocioConta nc = new NegocioConta(1002, "lucas", 0.0, 500.0);

        // UPCASTING - é um casting, conversao, da subclasse para a superclasse
        Conta c = nc;
        /**
         * por que não dar erro quando atribuimos um objeto da subclasse para uma
         * variavel da superclasse?
         * 
         * pq é uma relação "é-um", ouseja, um NegocioConta é uma Conta
         */
        Conta c2 = new NegocioConta();

        Conta c3 = new ContaPoupanca();

        //
        //
        //
        // DOWNCASTING - Quando eu converto um objeto da superclasse para a subclasse
        NegocioConta nc2 = (NegocioConta) conta;
        nc2.saque(100.0);
        nc2.emprestando(100.0);
        if (c3 instanceof NegocioConta) { // o instanceof vai verificar se o objeto corresponde a aquela classe que quer
                                          // converter
            NegocioConta c3c = (NegocioConta) c3;
        }

    }
}
