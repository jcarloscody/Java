package s11_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * do pacote java.util
 * 
 * o objeto Date armazena internamente: o numero de milisegundos desde a meia
 * noite do dia 01/01/1970 GMT(UTC)
 * 
 * GMT: Greenwich Mean Time(Time Zone) UTC: Coordinated Universal Time (time
 * standard)
 * 
 * SimpleDateFormat::: define formatos para conversão entre data e string
 * dd/MM/yyyy ou dd/MM/yyyy HH:mm:ss
 * 
 * Padrão ISO 8601 e classe Instant yyyy-MM-ddTHH:mm:ssZ
 * 
 * Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
 * 
 */

public class Datas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
        // criando um objeto desta classe para criar um objeto data com este formato de
        // string
        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date dataConvertida1 = data1.parse("25/06/2018");
        // vai converter em data

        Date dataConvertida2 = data2.parse("25/06/2018 15:42:07");

        System.out.println(dataConvertida1);// imprime mes/dia/ano
        System.out.println(dataConvertida2);
        System.out.println();
        System.out.println(data1.format(dataConvertida1));// imprime dia/mes/ano
        System.out.println(data2.format(dataConvertida2));

        System.out.println();
        Date hoje = new Date();
        System.out.println(data2.format(hoje));

        System.out.println();
        Date hojeEmMilisegundos = new Date(999999999999L);// converte o milissegundos em data
        System.out.println(data2.format(hojeEmMilisegundos));

        // Padrão ISO 8601
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println();
        System.out.println(data2.format(y3));
        SimpleDateFormat iso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        iso.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(iso.format(y3));
    }
}
