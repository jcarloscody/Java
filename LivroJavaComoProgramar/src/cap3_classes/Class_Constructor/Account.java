
package cap3_classes.Class_Constructor;

public class Account {

    private String sadu;
    private String name;

    /**
     * CONSTRUTOR PERSONALIZADO. nesta classe estaremos inicializando os objetos
     * desta classe por meio da criação do construtor. Não podem retornar valores,
     * nem mesmo void.
     */

    public Account(String sadu, String name) {
        /** construtor. -> o nome do construtor deve ser o mesmo nome da classe */
        this.sadu = sadu;
        this.name = name;
    }

    public void setName(String name, String saudacao) {
        this.name = name;
        this.sadu = saudacao;
    }

    public String getName() {
        return sadu + " " + name;
    }

}
