
package cap7_Array;


public class IntArray {
    public static void main(String[] args) {
        // declara array variável e o inicializa com um objeto arrayÿ
        int[] array = new int[10]; // cria o objeto array ÿ
        
        array[1]=20;

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array ÿ
        for (int counter = 0; counter < array.length; counter++) 
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
} // fim da classe InitArray

    

