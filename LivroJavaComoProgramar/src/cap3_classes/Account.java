
package cap3_classes;

/**
 * @param MODIFICADORES DE ACESSO são dois: public e private PRIVATE: posto
 *                      antes de métodos e variáveis,irá indicar que estes
 *                      elementos só serão configurados, acessível a métodos da
 *                      classe proprietaria.
 */
class Account {// A classe Account não pode executar por si só porque não contém um método main

    private String sadu;
    private String name; // variável de instância - Variáveis de instância de uma classe armazenam dados
                         // para cada objeto
    // são os atributos do objeto. os métodos configurarão isto.
    // os atributos do objeto são implementados desta forma, chamados de variável de
    // instância.

    /**
     * CONSTRUTOR PADRÃO Como aqui não temos uma declaração de construtor para
     * manipular as variáveis de instância, temos o construtor padrão declarado.
     * 
     */

    // método para definir o nome no objeto
    public void setName(String name, String saudacao)
    /**
     * o VOID indica o tipo de retorno, isto é, o setName executará uma tarefa, mas
     * não retornará, ouseja, não fornecerá nenhuma informação. string name --->
     * parâmetro do tipo string, que será passado para o método como argumento este
     * parâmetro é uma variável local e por ser local apenas este método pode ter
     * acesso. quando este método terminar, os valores da variável local(parâmetro)
     * será perdida
     */
    {
        this.name = name; // a variável local pode ter o mesmo nome da variável de instância, isto se
                          // chama SIMULAÇÃO, ou seja, um simula o outro.
        // o corpo do método irá referenciar a variável local.
        // para referenciar a variável de instância, será usado a palavra-chave THIS.
        sadu = saudacao; // neste caso não simula, assim pode dispensar a palavra-chave THIS.
        // MAS para boa construção de algoritmo é aconselhável fazer como supra

    }

    // método para recuperar o nome do objeto
    public String getName() {
        // a palavra-chave return retorna valor do nome para o chamador
        return sadu + " " + name;
    }

    private String chuva() { // método acessível apenas a classe proprietária
        return null;
    }

}
