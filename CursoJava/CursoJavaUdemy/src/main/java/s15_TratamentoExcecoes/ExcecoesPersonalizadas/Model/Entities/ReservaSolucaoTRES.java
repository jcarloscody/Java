package s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities;

/**SOLUÇÃO  BOA         */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaSolucaoTRES {
    private Integer numeroQuarto;
    private Date checkIn, checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaSolucaoTRES() {

    }

    public ReservaSolucaoTRES(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if (checkIn.after(checkOut)) {
            throw new IllegalArgumentException("o checkin deve ser antes de checkout");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duracao() {
        long diferencaCheckInCheckOut = checkOut.getTime() - checkIn.getTime(); // getTime() pega o milisegundos
        return TimeUnit.DAYS.convert(diferencaCheckInCheckOut, TimeUnit.MILLISECONDS); // Converte o milisegundos em
    }

    public void atualizacaoCheckInCheckOut(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new IllegalArgumentException("As datas digitadas devem ser futuras");
            // com o throw new: estou lançando uma exceção numa exceção já criada pelo java
            // com uma mensagem minha
            // IllegalArgumentException: estou usando uma exceção do java para dizer que há
            // uma irregularidade na argumentacao

        }
        if (checkIn.after(checkOut)) {
            throw new IllegalArgumentException("o checkin deve ser antes de checkout");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", CheckIn " + sdf.format(checkIn) + ", CheckOut " + sdf.format(checkOut)
                + ", " + duracao() + " noites";
    }
}
