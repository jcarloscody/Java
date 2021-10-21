package cap10_POO_Polimorfismo_Interface_abstrato;

public final class cfinal {
    /**
     * Uma classe final não pode ser estendida para criar uma subclasse. Todos os
     * métodos em uma classe final são implicitamente final. A classe String é um
     * exemplo de uma classe final. Se você puder criar uma subclasse de String, os
     * objetos dessa subclasse podem ser usados sempre que Strings forem esperadas.
     * Como a classe String não pode ser estendida, os programas que utilizam
     * Strings podem contar com a funcionalidade dos objetos String, conforme
     * especificado na Java API. Tornar a classe final também impede que
     * programadores criem subclasses que poderiam driblar as restrições de
     * segurança.
     */

    public final void xa() {
        /**
         * Um método final em uma superclasse não pode ser sobrescrito como uma
         * subclasse — isso garante que a implementação do método final será usada por
         * todas as subclasses diretas e indiretas na hierarquia. Métodos que são
         * declarados private são implicitamente final, porque não é possível
         * sobrescrevê-los como uma subclasse. Métodos que são declarados static também
         * são implicitamente final. Uma declaração do método final nunca pode mudar,
         * assim todas as subclasses utilizam a mesma implementação do método; e
         * chamadas a métodos final são resolvidas em tempo de compilação — isso é
         * conhecido como vinculação estática
         */
    }
}
