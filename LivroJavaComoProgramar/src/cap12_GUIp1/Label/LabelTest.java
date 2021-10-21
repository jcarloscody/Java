package cap12_GUIp1.Label;

// Figura 12.7: LabelTest.java
// Testando LabelFrame.
import javax.swing.JFrame;

public class LabelTest {
    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame(); // cria um objeto de classe LabelFrame
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * invoca o método setDefaultCloseOperation de LabelFrame (herdado de classe
         * JFrame) com a constante JFrame.EXIT_ON_CLOSE como o argumento para indicar
         * que o programa deve terminar quando a janela for fechada pelo usuário. Essa
         * linha é importante. Sem essa linha o aplicativo não terminará quando o
         * usuário fechar a janela
         */
        labelFrame.setSize(260, 180);
        /**
         * 1 invocamm o método setSize de LabelFrame para especificar a largura e altura
         * em pixels.
         */
        labelFrame.setVisible(true);
        /**
         * invoca o método setVisible de LabelFrame com o argumento true para exibir a
         * janela na tela. Tente redimensionar a janela para ver como o FlowLayout
         * altera as posições JLabel à medida que a largura de janela muda.
         */
    }
}
