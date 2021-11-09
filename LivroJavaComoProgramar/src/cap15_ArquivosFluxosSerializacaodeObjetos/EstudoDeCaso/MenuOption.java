package cap15_ArquivosFluxosSerializacaodeObjetos.EstudoDeCaso;

// tipo enum para as opções do programa de consulta de crédito.


public enum MenuOption {
    // declara o conteúdo do tipo enum
    ZERO_BALANCE(1), //exibe as contas com saldo zero
    CREDIT_BALANCE(2),//exibe as contas com saldos credores.
    DEBIT_BALANCE(3),//exibe as contas com saldos devedores.
    END(4);// encerra a execução do programa.

    private final int value; // opção atual de menu

    // construtor
    private MenuOption(int value) {
        this.value = value;
    }
} // fim do enum de MenuOptio
