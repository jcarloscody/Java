package cap15_ArquivosFluxosSerializacaodeObjetos.SerializacaoDeObjeto;

/*Observação de engenharia de software 15.1
Esta seção apresentou a serialização de objetos e demonstrou as técnicas básicas desse processo. A serialização é um tema profundo
com muitas complexidades e armadilhas. Antes de implementá-la em aplicativos de produção robustos, leia cuidadosamente a
documentação Java on-line sobre a serialização de objetos*/


// Classe Account serializável para armazenar registros como objetos.

/*. A classe Account implementa a interface Serializable (linha 5),
o que permite que objetos dessa classe sejam serializados e desserializados com ObjectOutputStreams e ObjectInputStreams,
respectivamente. A interface Serializable é uma interface de tags. Essa interface não contém nenhum método. Uma classe que
implementa Serializable é marcada com tags como um objeto Serializable.*/

import java.io.Serializable;

public class Account implements Serializable {  //A classe Account implementa a interface Serializable (linha 5), o que permite que objetos dessa classe sejam serializados e desserializados com ObjectOutputStreams e ObjectInputStreams, respectivamente. A interface Serializable é uma interface de tags. Essa interface não contém nenhum método. Uma classe que implementa Serializable é marcada com tags como um objeto Serializable.

    //Variavel de Instancia e transient:  Em uma classe Serializable, cada variável de instância deve ser Serializable. Variáveis de instância não Serializable devem ser declaradas transient para indicar que elas devem ser ignoradas durante o processo de serialização. Por padrão, todas as variáveis de tipo primitivo são serializáveis. Para variáveis de tipo por referência, você precisa verificar a documentação da classe (e possivelmente suas superclasses) a fim de garantir que o tipo é Serializable. Por exemplo, Strings são Serializable. Por  padrão, os arrays são serializáveis; mas em um array de tipos por referência, os objetos referenciados talvez não o sejam. A classe Account contém os membros de dados private account, firstName, lastName e balance — todos eles são Serializable. Essa classe também fornece os métodos public get e set para acessar os campos private.
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // inicializa uma Account com valores padrão
    public Account() {
        this(0, "", "", 0.0); // chama outro construtor
    }

    // inicializa uma Account com os valores fornecidos
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // configura o número de conta
    public void setAccount(int acct) {
        this.account = account;
    }

    // obtém número de conta
    public int getAccount() {
        return account;
    }

    // configura o nome
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // obtém o nome
    public String getFirstName() {
        return firstName;
    }

    // configura o sobrenome
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // obtém o sobrenome
    public String getLastName() {
        return lastName;
    }

    // configura saldo
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // obtém saldo
    public double getBalance() {
        return balance;
    }
} // fim da classe Account
