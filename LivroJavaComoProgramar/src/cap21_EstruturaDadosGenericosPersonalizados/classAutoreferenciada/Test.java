
package cap21_EstruturaDadosGenericosPersonalizados.classAutoreferenciada;


public class Test {
    public static void main(String[] args) {
        Node<Integer> nodeToAdd = new Node<Integer>(10);
        
        Node<String> nodeString = new Node<String>("estamos here");
        
        nodeToAdd.setNext(nodeString);
        
        System.out.println(nodeToAdd.getData());
        System.out.println(nodeString.getData());
        System.out.println(nodeString.getNext());
        System.out.println(nodeToAdd.getNext().getData());
    }
}
