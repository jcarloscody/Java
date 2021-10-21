package s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities;

/**SOLUÇÃO MUITO RUIM         */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaSolucaoUM {
    private Integer numeroQuarto;
    private Date checkIn, checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaSolucaoUM(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duracao() {
        long diferencaCheckInCheckOut = checkOut.getTime() - checkIn.getTime(); // getTime() pega o milisegundos
        return TimeUnit.DAYS.convert(diferencaCheckInCheckOut, TimeUnit.MILLISECONDS); // Converte o milisegundos em
    }

    public void atualizacaoCheckInCheckOut(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", CheckIn " + sdf.format(checkIn) + ", CheckOut " + sdf.format(checkOut)
                + ", " + duracao() + " noites";
    }
}
