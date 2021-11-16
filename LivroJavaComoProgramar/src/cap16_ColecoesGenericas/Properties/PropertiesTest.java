/*
Um objeto Properties é uma Hashtable persistente que normalmente armazena pares chave–valor de strings — supondo 
que você utiliza os métodos setProperty e getProperty para manipular a tabela em vez dos métodos String Hashtable e put
herdados. Por “persistente”, queremos dizer que o objeto Properties pode ser gravado em um fluxo de saída (possivelmente um arquivo) e lido de volta por um fluxo de entrada (input stream). Um uso comum dos objetos Properties nas versões anteriores do Java 
era manter os dados de configuração de aplicativos ou as preferências de usuário para aplicativos
 */
package cap16_ColecoesGenericas.Properties;

/**
 *
 * @author developer
 */
// Demonstra classe Properties do pacote java.util.
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties table = new Properties();

        // configura propriedades ÿ
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // substitui o valor de propriedade ÿ
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);
        saveProperties(table);

        table.clear(); // tabela vaziaÿ

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        // obtém valor de cor da propriedade ÿ
        Object value = table.getProperty("color");

        // verifica se o valor está na tabela
        if (value != null) {
            System.out.printf("Property color's value is %s%n", value);
        } else {
            System.out.println("Property color is not in table");
        }
    }

    // salva as propriedades em um arquivo
    private static void saveProperties(Properties props) {
        // salva o conteúdo de tabela
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // salva as propriedadesÿ
            output.close();
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // carrega as propriedades de um arquivo
    private static void loadProperties(Properties props) {
        // carrega o conteúdo de tabela
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input); // carrega propriedadesÿ
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // gera saída de valores de propriedade
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); // obtém nomes de propriedadeÿ

        // gera saída de pares nome/valor
        for (Object key : keys) {
            System.out.printf(
                    "%s\t%s%n", key, props.getProperty((String) key));
        }

        System.out.println();
    }
} // fim da classe PropertiesTest
