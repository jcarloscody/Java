package s14_HerancaPolimorfismo.Polimorfismo;

import s14_HerancaPolimorfismo.Banco.Conta;
import s14_HerancaPolimorfismo.Banco.ContaPoupanca;

public class exe {
    public static void main(String[] args) {

        Conta conta = new Conta(1020, "josu", 1000.0);
        /**
         * Em POO, polimorfismo é recurso que permite que variaveis de um mesmo tipo
         * mais generico possam apontar para objetos de tipos especificos diferentes,
         * tendo assim comportamentos diferentes conforme cada tipo especifico
         */

        Conta polimorfismo = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
        /**
         * A Associação do tipo específico com o tipo genérico é feita em tempo de
         * execução (upcasting)
         * 
         * O compilador não sabe para qual tipo espec´fico a chamada do método saque
         * está sendo feita (ele só sabe que sao duas variaveis tipo Conta)
         */

        conta.saque(100);
        System.out.println(conta.getBalance());
        polimorfismo.saque(100);
        System.out.println(polimorfismo.getBalance());

    }
}
