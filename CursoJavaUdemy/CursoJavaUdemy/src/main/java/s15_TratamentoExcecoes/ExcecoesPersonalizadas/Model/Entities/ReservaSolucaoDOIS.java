package s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities;

/**SOLUÇÃO  RUIM         */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaSolucaoDOIS {
    private Integer numeroQuarto;
    private Date checkIn, checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaSolucaoDOIS() {

    }

    public ReservaSolucaoDOIS(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duracao() {
        long diferencaCheckInCheckOut = checkOut.getTime() - checkIn.getTime(); // getTime() pega o milisegundos
        return TimeUnit.DAYS.convert(diferencaCheckInCheckOut, TimeUnit.MILLISECONDS); // Converte o milisegundos em
    }

    public String atualizacaoCheckInCheckOut(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return "As datas digitadas devem ser futuras";
        }
        if (checkIn.after(checkOut)) {
            return "o checkin deve ser antes de checkout";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", CheckIn " + sdf.format(checkIn) + ", CheckOut " + sdf.format(checkOut)
                + ", " + duracao() + " noites";
    }
}
