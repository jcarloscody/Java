package cap15_ArquivosFluxosSerializacaodeObjetos.SerializacaoDeObjeto.InterfaceGraf;

// Testa a classe JFileChooserDemo.
/*A classe JFileChooser exibe uma caixa de diálogo que permite ao usuário selecionar facilmente arquivos ou diretórios.

 */
import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        JFileChooserDemo application = new JFileChooserDemo();
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
} // fim da classe JFileChooserTest
