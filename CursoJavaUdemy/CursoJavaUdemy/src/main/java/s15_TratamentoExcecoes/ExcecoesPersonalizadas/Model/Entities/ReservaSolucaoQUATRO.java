package s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities;

/**SOLUÇÃO  BOA         */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Exception.DomainException;

public class ReservaSolucaoQUATRO {
    private Integer numeroQuarto;
    private Date checkIn, checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaSolucaoQUATRO() {

    }

    public ReservaSolucaoQUATRO(Integer numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
        if (checkIn.after(checkOut)) {
            throw new DomainException("o checkin deve ser antes de checkout");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duracao() {
        long diferencaCheckInCheckOut = checkOut.getTime() - checkIn.getTime(); // getTime() pega o milisegundos
        return TimeUnit.DAYS.convert(diferencaCheckInCheckOut, TimeUnit.MILLISECONDS); // Converte o milisegundos em
    }

    public void atualizacaoCheckInCheckOut(Date checkIn, Date checkOut) throws DomainException {
        // se a class DomainException extends RuntimeException não seria obrigado a
        // tratar a exceção, desta forma a propagação nao seria obrigatorio caso nao
        // tratasse

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("As datas digitadas devem ser futuras");

        }
        if (checkIn.after(checkOut)) {
            throw new DomainException("o checkin deve ser antes de checkout");
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
