
package cap16_ColecoesGenericas.MetodosCollections.MethodsReverseFillCopyMaxMin;

// Métodos Collections reverse, fill, copy, max e min.
//A classe Collections fornece métodos para inverter, preencher e copiar Lists.
//O método Collections reverse inverte a ordem dos elementos em uma List e o 
//método fill sobrescreve elementos em uma List com um valor especificado. A operação  fill é útil para reinicializar uma List. 
//O método copy recebe dois argumentos — uma List de destino e uma List de origem. Cada elemento da List de origem é copiado para a List de destino. A List de destino deve ser pelo menos tão longa quanto a List de origem; caso contrário, uma IndexOutOfBoundsException ocorre. Se a List de destino for mais longa, os elementos não sobrescritos permanecem inalterados

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 {

    public static void main(String[] args) {
        // crie e exibe uma List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters); // obtém List
        System.out.println("list contains: ");
        output(list);

        // inverte e exibe uma List<Character>
        Collections.reverse(list); // inverte a ordem dos elementosÿ
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        // cria CopyList de um array de 3 caracteres
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copia o conteúdo da lista para CopyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        // preenche a lista com Rs 
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    // envia informações de List para saída
    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf(" Min: %s%n", Collections.min(listRef));
    }
} // fim da classe Algorithms1
