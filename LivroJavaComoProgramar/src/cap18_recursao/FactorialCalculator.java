/*
Quando um método recursivo é 
chamado para resolver um problema, na verdade, ele é capaz de atuar somente no(s) caso(s) mais simples(s), ou caso(s) básico(s). 
Se o método é requisitado para um caso básico, ele retorna um resultado. Se é para um problema mais complexo, ele o divide em 
duas partes conceituais — uma que o método sabe como solucionar e outra que ele não sabe.

Um método recursivo pode chamar outro método, que por sua vez pode fazer uma chamada de volta ao método recursivo. Isso é 
conhecido como uma chamada recursiva indireta ou recursão indireta. Por exemplo, o método A chama o método B, que faz uma 
chamada de volta ao método A. Isso ainda é recursão, porque a segunda chamada para o método A é feita enquanto a primeira está 
ativa — isto é, a primeira chamada ao método A ainda não concluiu sua execução (porque está esperando o método B voltar um 
resultado para ela) e não retornou ao chamador original do método A.
 */
package cap18_recursao;

// Método fatorial recursivo.
public class FactorialCalculator {
// método fatorial recursivo (supõe que o parâmetro é >= 0)ÿ

    public static long factorial(long number) {
        if (number <= 1) // testa caso básico ÿ
        {
            return 1; // casos básicos: 0! = 1 e 1! = 1 ÿ
        } else // passo de recursão ÿ
        {
            return number * factorial(number - 1);
        }
    }

    // gera saída de fatoriais para valores de 0 a 21
    public static void main(String[] args) {
        // calcula o fatorial de 0 a 21
        for (int counter = 0; counter <= 21; counter++) {
            System.out.printf("%d! = %d %n", counter , factorial(counter));
        }
 } 
 } // fim da classe FactorialCalculator
