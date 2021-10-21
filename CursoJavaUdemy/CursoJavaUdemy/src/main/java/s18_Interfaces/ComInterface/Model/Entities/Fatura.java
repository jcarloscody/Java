package s18_Interfaces.ComInterface.Model.Entities;

public class Fatura {
    private Double valorBasicoDePagamento;
    private Double taxa;

    public Fatura() {
    }

    public Fatura(Double valorBasicoDePagamento, Double taxa) {
        this.valorBasicoDePagamento = valorBasicoDePagamento;
        this.taxa = taxa;
    }

    public Double getValorBasicoDePagamento() {
        return valorBasicoDePagamento;
    }

    public void setValorBasicoDePagamento(Double valorBasicoDePagamento) {
        this.valorBasicoDePagamento = valorBasicoDePagamento;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTotalPagamento() {
        return getValorBasicoDePagamento() + getTaxa();
    }
}
