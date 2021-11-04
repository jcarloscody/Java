
package cap12_GUIp1.butao;

// Figura 12.15: ButtonFrame.java
// Botões de comando e eventos de ação.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
public class ButtonFrame  extends JFrame{
    private final JButton plainJButton; // botão apenas com textoÿ
    private final JButton fancyJButton; // botão com ícones ÿ

    // ButtonFrame adiciona JButtons ao JFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        plainJButton = new JButton("Plain Button"); // botão com textoÿ
        add(plainJButton); // adiciona plainJButton ao JFrame
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.jpg"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug1.jpg"));
        fancyJButton = new JButton("Fancy Button", bug1); // configura imagemÿ
        fancyJButton.setRolloverIcon(bug2); // configura imagem de rollover ÿ
        add(fancyJButton); // adiciona fancyJButton ao JFrame
        // cria novo ButtonHandler de tratamento para tratamento de evento de botãoÿ
        ButtonHandler handler = new ButtonHandler(); 
        fancyJButton.addActionListener(handler); 
        plainJButton.addActionListener(handler); 
    }
    
// classe interna para tratamento de evento de botão
    private class ButtonHandler implements ActionListener{
        // trata evento de botão
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));
        }
    }
} 
 // fim da classe ButtonTest

