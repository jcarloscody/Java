package cap12_GUIp1;

// Figura 12.2: Addition.java
// Programa de adição que utiliza JOptionPane para entrada e saída.
import javax.swing.JOptionPane;

public class EntradaSaidaJOptionPane {

    public static void main(String[] args) {
        // obtém a entrada de usuário a partir dos diálogos de entrada JOptionPaneÿ
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        // converte String em valores int para utilização em um cálculo
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        /**
         * o método parseInt da classe Integer static converte seu argumento
         * String em um valor int e pode lançar uma NumberFormatException.
         */

        int sum = number1 + number2;

        // exibe o resultado em um diálogo de mensagem JOptionPaneÿ
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
        /**
         * o JOptionPane exibida é uma caixa de diálogo modal — enquanto a caixa
         * de diálogo está na tela, o usuário não pode interagir com o restante
         * do aplicativo.
         *
         * Não abuse de caixas de diálogo modais, uma vez que elas podem reduzir
         * a usabilidade dos seus aplicativos. Use uma caixa de diálogo modal
         * apenas quando for necessário, para evitar que os usuários interajam
         * com o restante de um aplicativo até que eles fechem a caixa de
         * diálogo.
         */

        /**
         * NULL -> O primeiro argumento referencia essa janela (conhecida como
         * janela pai) e faz com que a caixa de diálogo seja exibida no centro
         * em relação ao pai (como foi feito na Seção 12.9). Se o primeiro
         * argumento for null, a caixa de diálogo será exibida no centro da tela
         *
         * SEGUNDO ARGUMENTO -> é a mensagem a exibir — nesse caso, o resultado
         * da concatenação de String "The sum is" e do valor de sum.
         *
         * TERCEIRO ARGUMENTO -> * —"Sum of Two Integers" — é a String que deve
         * aparecer na barra de título na parte superior da caixa de diálogo.
         *
         * QUARTO ARGUMENTO -> * — JOptionPane.PLAIN_MESSAGE — é o tipo de caixa
         * de diálogo de mensagem a exibir. O diálogo PLAIN_MESSAGE não exibe um
         * ícone à esquerda da mensagem.
         */
        /**
         * Constantes de diálogo de mensagem JOptionPane
         *
         * ERROR_MESSAGE
         *
         * INFORMATION_MESSAGE - Indica uma mensagem informativa.
         *
         * WARNING_MESSAGE - Alerta de um potencial problema.
         *
         * QUESTION_MESSAGE - Faz uma pergunta. Normalmente, esse diálogo exige
         * uma resposta, como clicar em um botão Yes ou No.
         *
         * PLAIN_MESSAGE - Sem ícone. Um diálogo que contém uma mensagem, mas
         * nenhum ícone.
         */
    }
}
