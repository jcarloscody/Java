
package principal.struturedata.Aula3ListaLigada;

/**
 *
 * @author developer  https://github.com/leandroguarino/estruturas_de_dados_java_aula03/tree/master/src/main/java/aula03_lista_ligada
 */
public class Aula3_ListaLigada {
    
    /*
    a lista ligada vem resolver alguns problemas do vetor, como a exclusao que deixa um vacuo no vetor, as posicoes q sao fixas estáticas.
    
    lista ligada é uma estrutura em que cada elemento sabe quem é o seu proximo.
    o problema da lista ligada é q pra fazer uma busca temos que fazer uma pesquisa desde o primeiro até o ultimo, ao contrário do vetor
    que podemos fazer uma busca direta. entao para muitos elementos a lista ligada é boa, para pesquisa o vetor é bom
    */
     public static void main(String[] args) {
        
        Lista_ligada lista = new Lista_ligada();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());
        
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
        //remover estado DF
        lista.remover("DF");
        System.out.println("Removeu estado DF");
        lista.adicionar("SP");
        System.out.println("Adicionou estado SP");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("SP");
        lista.adicionar("RJ");
        
        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
    
}
