package cap21_EstruturaDadosGenericosPersonalizados.ListaEncadeadas.List;

// classe para representar um nó em uma lista
class ListNode<T> {
    // membros de acesso de pacote; List pode acessá-los diretamente

    T data; // dados para esse nó
    ListNode<T> nextNode; // referência para o próximo nó na listaÿ

    // construtor cria um ListNode que referencia o objeto
    ListNode(T object) {
        this(object, null);
    }

    // construtor cria ListNode que referencia o objeto
    // especificado e o próximo ListNode
    ListNode(T object, ListNode<T> node) {
        data = object;
        nextNode = node;
    }

    // retorna referência aos dados no nó
    T getData() {
        return data;
    }

    // retorna referência ao próximo nó na lista
    ListNode<T> getNext() {
        return nextNode;
    }
} // fim da classe ListNode<T>


