/**COLETA DE LIXO
 * > Cada objeto utiliza recursos do sistema, como memória. Precisamos de uma maneira disciplinada de retornar os recursos ao sistema quando eles não são mais necessários; caso contrário, podem ocorrer “vazamentos de recursos”.
 * > A JVM executa coleta de lixo automática para recuperar a memória ocupada por objetos que não são mais usados. Quando não há mais referências a um objeto, o objeto é marcado para coleta de lixo.
 * > Vazamentos de recursos além de vazamentos de memória também podem ocorrer. Por exemplo, um aplicativo pode abrir um arquivo no disco para modificar seu conteúdo — se o aplicativo não fechar o arquivo, 
 * ele deve terminar antes que qualquer outro aplicativo possa usar o arquivo
 * > Muitas classes Java API (por exemplo, a classe Scanner e classes que leem arquivos ou gravam arquivos em disco) fornecem o método close ou dispose, que os programadores podem chamar para liberar os recursos quando 
 * eles não são mais necessários em um programa
 */
package cap8_Class.statico;

/** MEMBROS DA CLASSE STATIC
 *> Cada objeto tem sua própria cópia de todas as variáveis de instância da classe. Em certos casos, apenas uma cópia de uma variável particular deve ser compartilhada por todos os objetos de uma classe. Um campo static — chamado variável de classe — é
        utilizado nesses casos. Uma variável static representa informações de escopo de classe — todos os objetos da classe compartilham
        os mesmos dados. A declaração de uma variável static inicia com a palavra-chave static
 *> ESCOPO DE CLASSE: Variáveis estáticas têm escopo de classe — elas podem ser usadas em todos os métodos da classe. Podemos acessar membros
        public static de uma classe por meio de uma referência a qualquer objeto da classe ou qualificando o nome de membro com o
        nome de classe e um ponto (.), como em Math.random().  
 *> Variáveis e métodos de classe static existem e podem ser utilizados, mesmo se nenhum objeto dessa classe tiver sido instanciado.
 *> Um método static não pode acessar as variáveis de instância e os métodos de instância de uma classe, porque um método
        static pode ser chamado mesmo quando nenhum objeto da classe foi instanciado. Pela mesma razão, a referência this não pode
        ser utilizada em um método static. A referência this deve se referir a um objeto específico da classe e, quando um método static
        é chamado, talvez não haja nenhum objeto da sua classe na memória. 
 */
public class Employee {
    // Variável static utilizada para manter uma contagem do número de
    // objetos Employee na memória.
    private static int count = 0; // número de Employees criadosÿ
    private String firstName;
    private String lastName;

    // inicializa Employee, adiciona 1 a static count e
    // gera a saída de String indicando que o construtor foi chamado
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // incrementa contagem estática de empregadosÿ
        System.out.printf("Employee constructor: %s %s; count = %d%n",
        firstName, lastName, count);
    }

    // obtém o primeiro nome
    public String getFirstName(){
        return firstName;
    }

    // obtém o último nome
    public String getLastName(){
        return lastName;
    }

    // método estático para obter valor de contagem de estáticaÿ
    public static int getCount() { 
        return count; 
    } 
}
