package s13_Enumeracao_Composicao.Composicao.Comentarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.stream.events.Comment;

public class exe {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coments c1 = new Coments("olá my friens");
        Coments c2 = new Coments(" eu estava lá");
        Coments c3 = new Coments(" eu estava lá");
        Coments c4 = new Coments(" eu estava lá");

        Postes p1 = new Postes(sdf.parse("21/06/2015 12:55:21"), "fazendo xodo", "rato mais rao", 12);

        p1.setComentarios(c1);
        p1.setComentarios(c2);
        p1.setComentarios(c3);
        p1.setComentarios(c4);

        System.out.println(p1);

    }
}
