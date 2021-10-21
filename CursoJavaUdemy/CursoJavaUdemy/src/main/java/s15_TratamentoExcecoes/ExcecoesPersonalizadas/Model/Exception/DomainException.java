package s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Exception;

public class DomainException extends Exception {
    // pode estender qq das duas
    // extends Exception ->: o compilador vai obrigar vc a tratar
    // extends RuntimeException ->: RuntimeException é um tipo de exceção que o
    // compilador nao obriga a vc a tratar. mas lembrando que se não for preventivo
    // e não tratar essa excecao não obrigatorio o progbrama quebra, por isso que
    // mesmo nao sendo obrigatorio é importante tratar

    public DomainException(String mensagem) {
        super(mensagem);
        /**
         * aqui estou passando uma mensagem para o construtor da super class com o
         * objetivo de permitir que eu possa instanciar a minha exceção personalizada
         * passando uma mensagem para ela e essa mensagem vai ficar armazenada dentro da
         * minha exceção
         */
    }

}
