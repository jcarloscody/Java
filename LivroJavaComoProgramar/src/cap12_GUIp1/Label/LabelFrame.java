package cap12_GUIp1.Label;

// Figura 12.6: LabelFrame.java
// JLabels com texto e ícones.
import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens

public class LabelFrame extends JFrame {
    // A classe LabelFrame (Figura 12.6) estende JFrame para herdar os recursos de
    // uma janela.
    private final JLabel label1; // JLabel apenas com texto
    private final JLabel label2; // JLabel construído com texto e ícone
    private final JLabel label3; // JLabel com texto e ícone adicionados

    // construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame() {
        super("Testing JLabel");
        /**
         * Invoca o construtor da superclasse JFrame com o argumento "Testing JLabel". O
         * construtor de JFrame utiliza essa String como o texto na barra de título da
         * janela.
         */
        setLayout(new FlowLayout()); // configura o layout de frame
        /**
         * especificar o layout -> Além disso, você normalmente tem de decidir onde
         * posicionar cada componente GUI — conhecido como especificar o layout. O Java
         * fornece vários gerenciadores de layout que podem ajudá-lo a posicionar
         * componentes. Para garantir que nossas GUIs podem ser usadas com qualquer IDE,
         * não utilizamos um IDE para criar o código da GUI. Usamos gerenciadores de
         * layout do Java para dimensionar e posicionar os componentes.
         * 
         * FlowLayout -> Com o gerenciador de layout FlowLayout, os componentes são
         * posicionados em um contêiner da esquerda para a direita na ordem em que eles
         * são adicionados.
         * 
         * setLayout -> O método setLayout é herdado na classe LabelFrame indiretamente
         * da classe Container. O argumento para o método deve ser um objeto de uma
         * classe que implementa a interface LayoutManager (por exemplo, FlowLayout).
         */

        // Construtor JLabel com um argumento de string
        label1 = new JLabel("Label with text");// criaum objeto JLabel e passa a "Label with text" para o construtor. O
                                               // JLabel exibe esse texto na tela.

        label1.setToolTipText("This is label1");// Esta linha utiliza o método setToolTipText (herdado por JLabel de
                                                // JComponent) para especificar a dica de ferramenta que é exibida
                                                // quando o usuário posiciona o cursor de mouse sobre o JLabel na GUI
        add(label1); // adiciona o label1 ao JFrame
        // anexa label1 ao LabelFrame passando label1 para o método add, que é herdado
        // indiretamente da classe Container

        // construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("icon.jpg"));
        /**
         * Um ícone normalmente é especificado com um argumento Icon (pacote
         * javax.swing) para um construtor ou método setIcon do componente.
         */
        /**
         * A classe ImageIcon suporta vários formatos de imagem, incluindo Graphics
         * Interchange Format (GIF), Portable Network Graphics (PNG) e Joint
         * Photographic Experts Group (JPEG).
         */
        /**
         * declara um ImageIcon. O arquivo icon.jpg contém a imagem para carregar e
         * armazenar no objeto ImageIcon. Essa imagem está incluída no diretório desse
         * exemplo. O objeto ImageIcon é atribuído à referência Icon bug.
         */
        /**
         * invoca o método getClass (herdado indiretamente da classe Object) para
         * recuperar uma referência ao objeto Class que representa a declaração da
         * classe LabelFrame. Essa referência é então utilizada para invocar o método
         * Class getResource, que retorna a localização da imagem como um URL. O
         * construtor ImageIcon utiliza o URL para localizar a imagem e, em seguida,
         * carrega essa imagem na memória.
         */
        // label1.setText("josue - dei um set");

        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        /**
         * utilizam outro construtor JLabel para criar um JLabel que exibe o texto
         * "Label with text and icon" e o Icon bug criado.
         * 
         * . O último argumento do construtor indica que o conteúdo do rótulo está
         * justificado à esquerda ou alinhado à esquerda (isto é, o ícone e texto estão
         * à esquerda da área do rótulo na tela). A interface SwingConstants (pacote
         * javax.swing) declara um conjunto de constantes de inteiro comuns (como
         * SwingConstants.LEFT, SwingConstants.CENTER e SwingConstants.RIGHT) que são
         * utilizadas com muitos componentes Swing.
         */
        label2.setToolTipText("This is label2");
        add(label2); // adiciona label2 ao JFrame

        label3 = new JLabel(); // Construtor JLabel sem argumentos

        label3.setText("Label with icon and text at bottom");
        /**
         * utiliza o método JLabel setText para configurar o texto exibido no rótulo
         */

        label3.setIcon(bug); // adiciona o ícone ao JLabel
        /**
         * o método JLabel setIcon para especificar o Icon a exibir
         */

        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        /**
         * utilizam os métodos JLabel setHorizontalTextPosition e
         * setVerticalTextPosition para especificar a posição de texto no rótulo. Nesse
         * caso, o texto será centralizado horizontalmente e aparecerá na parte inferior
         * do rótulo. Portanto, o Icon aparecerá acima do texto. As constantes de
         * posição horizontal em SwingConstants são LEFT, CENTER e RIGHT
         */
        label3.setToolTipText("This is label3");
        add(label3); // adiciona label3 ao JFrame
    }
}
