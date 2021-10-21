package cap12_GUIp1.Text;

// Figura 12.9: TextFieldFrame.java
// JTextField e JPasswordField.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1; // campo de texto com tamanho configurado
    private final JTextField textField2; // campo de texto com texto
    private final JTextField textField3; // campo de texto com texto e tamanho
    private final JPasswordField passwordField; // campo de senha com texto

    // construtor TextFieldFrame adiciona JTextFields a JFrame
    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // cria campo de texto com 10 colunas
        textField1 = new JTextField(10);
        /**
         * A largura em pixels de uma coluna de texto é determinada pela largura média
         * de um caractere na fonte atual do campo de texto. Quando o texto é exibido em
         * um campo de texto e ele for mais largo que o próprio campo de texto, uma
         * parte do texto à direita não é visível. Se você digitar em um campo de texto
         * e o cursor alcançar a borda direita, o texto na borda esquerda é empurrado
         * para fora do lado esquerdo do campo e não mais é visível. Usuários podem
         * utilizar as teclas de seta para a esquerda e para a direita a fim de
         * percorrer todo o texto
         */

        add(textField1); // adiciona textField1 ao JFrame

        // cria campo de texto com texto padrão ÿ
        textField2 = new JTextField("Enter text here");
        /**
         * cria textField2 com o texto inicial "Enter text here" para exibir no campo de
         * texto. A largura do campo é determinada pela largura do texto padrão
         * especificado no construtor
         */

        add(textField2); // adiciona textField2 ao JFrame

        // cria campo de texto com texto padrão e 21 colunas
        textField3 = new JTextField("Uneditable text field", 21);
        /**
         * cria textField3 e chama o construtor JTextField com dois argumentos — o texto
         * padrão "Uneditable text field" a ser exibido e a largura dos campos de texto
         * em número de colunas (21).
         */

        textField3.setEditable(false); // desativa a edição
        /**
         * utiliza o método setEditable (herdado por JTextField da classe
         * JTextComponent) para tornar o campo de texto não editável — isto é, o usuário
         * não pode modificar o texto no campo
         */

        add(textField3); // adiciona textField3 ao JFrame

        // cria campo de senha com texto padrão
        passwordField = new JPasswordField("Hidden text");
        /**
         * cria passwordField com o texto "Hidden text" a ser exibido no campo de texto.
         * A largura do campo é determinada pela largura do texto padrão. Ao executar o
         * aplicativo, note que o texto é exibido como uma string de asteriscos.
         */

        add(passwordField); // adiciona passwordField ao JFrame

        /**
         * Quando o usuário pressiona Enter em um JTextField ou JPasswordField, ocorre
         * um ActionEvent (pacote java.awt.event). Um evento assim é processado por um
         * objeto que implementa a interface ActionListener (pacote java.awt.event). As
         * informações discutidas aqui são disponíveis na documentação de Java API das
         * classes JTextField e ActionEvent. Visto que JPasswordField é uma subclasse de
         * JTextField, JPasswordField suporta os mesmos eventos
         */

        // rotinas de tratamento de evento registradoras
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    /**
     * Passos necessários para configurar o tratamento de evento para um componente
     * GUI Esse exemplo deve exibir um diálogo de mensagem que contém o texto de um
     * campo de texto quando o usuário pressionar Enter nesse campo de texto. Antes
     * que um aplicativo possa responder a um evento para um determinado componente
     * GUI, você deve:
     * 
     * 1. Criar uma classe que representa a rotina de tratamento de evento e
     * implementa uma interface apropriada — conhecida como interface ouvinte de
     * evento.
     * 
     * 2. Indicar que um objeto da classe do Passo 1 deve ser notificado quando o
     * evento ocorre — conhecido como registrar a rotina de tratamento de evento.
     */

    /**
     * Todas as classes discutidas até agora foram chamadas de -->> classes de
     * primeiro nível — isto é, elas não foram declaradas dentro de outra classe.
     * 
     * O Java permite declarar classes dentro de outras classes — elas são chamadas
     * de -- > classes aninhadas.
     * 
     * As classes aninhadas podem ser static ou não static
     * 
     * As classes não static aninhadas são chamadas classes internas e são
     * frequentemente utilizadas para implementar rotina de tratamento de evento
     * 
     * Um objeto da classe interna deve ser criado por um objeto da classe de
     * primeiro nível que contém a classe interna. Cada objeto da classe interna tem
     * implicitamente uma referência a um objeto da classe de primeiro nível. O
     * objeto da classe interna pode usar essa referência implícita para acessar
     * diretamente todas as variáveis e métodos da classe de primeiro nível.
     * 
     * . Uma classe aninhada que é static não exige um objeto de sua classe de
     * primeiro nível e não tem implicitamente uma referência a um objeto da classe
     * de primeiro nível
     */

    // classe interna private para tratamento de evento
    private class TextFieldHandler implements ActionListener {
        /**
         * Essa classe é private porque será utilizada apenas para criar rotina de
         * tratamento de evento para os campos de texto na classe de primeiro nível
         * TextFieldFrame.
         * 
         * Tal como acontece com outros membros de classe, as classes internas podem ser
         * declaradas public, protected ou private.
         * 
         * a classe interna TextFieldHandler implementa a interface ActionListener e
         * declara o único método nessa interface — actionPerformed. Esse método
         * especifica as tarefas a serem realizadas quando ocorrer um ActionEvent.
         * 
         * Assim, a classe interna TextFieldHandler satifaz o Passo 1 listado
         * anteriormente nesta seção.
         */

        // processa eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            // usuário pressionou Enter no JTextField textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s", event.getActionCommand());

            // usuário pressionou Enter no JTextField textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());

            // usuário pressionou Enter no JTextField textField3
            else if (event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());

            // usuário pressionou Enter no JTextField passwordField
            else if (event.getSource() == passwordField)
                string = String.format("passwordField: %s", event.getActionCommand());

            // exibe o conteúdo de JTextField
            JOptionPane.showMessageDialog(null, string);
        }
    }// fim da classe TextFieldHandler interna private
}// fim da classe TextFieldFrame
