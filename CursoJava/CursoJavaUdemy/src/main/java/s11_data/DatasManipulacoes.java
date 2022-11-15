package s11_data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DatasManipulacoes {
    public static void main(String[] args) {
        Date dataAntiga = Date.from(Instant.parse("2018-06-02T15:42:55Z"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println();
        System.out.println(sdf.format(dataAntiga));

        // ADICIONANDO VALORES A DATA
        System.out.println();
        System.out.println("Adicionando");
        Calendar calendario = Calendar.getInstance();// objeto de calendario

        calendario.setTime(dataAntiga);// adiciona o objeto data ao metodo setTime do objeto Calendar
        calendario.add(Calendar.HOUR_OF_DAY, 4);// adiciona 4 horas
        dataAntiga = calendario.getTime();
        System.out.println(sdf.format(dataAntiga));

        // OBTENDO UMA UNIDADE DE TEMPO
        System.out.println();
        System.out.println("OBTENDO UMA UNIDADE DE TEMPO");
        int minutos = calendario.get(Calendar.MINUTE);
        System.out.println("minutos: " + minutos);
    }
}
