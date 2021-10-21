package s13_Enumeracao_Composicao.Composicao;

import java.util.Date;

public class HoraContratual {
    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HoraContratual() {

    }

    public HoraContratual(Date data, Double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public double ValorTotal() {
        return valorPorHora * horas;
    }

    public Date getDate() {
        return data;
    }
}
