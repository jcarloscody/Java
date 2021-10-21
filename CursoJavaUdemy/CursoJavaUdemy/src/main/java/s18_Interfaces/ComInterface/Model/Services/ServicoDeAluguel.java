package s18_Interfaces.ComInterface.Model.Services;

import s18_Interfaces.ComInterface.Model.Entities.AluguelDeCarros;
import s18_Interfaces.ComInterface.Model.Entities.Fatura;

public class ServicoDeAluguel {
    private Double precoPorDia;
    private Double precoPorHora;

    private TaxaServicos taxaServicos;

    public ServicoDeAluguel(Double precoPorDia, Double precoPorHora, TaxaServicos taxaServicos) { // vai dar um
                                                                                                  // upcasting no taxa
                                                                                                  // Servicos quando
                                                                                                  // colocar o
                                                                                                  // BrasilTaxaServices
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaServicos = taxaServicos;
    }

    public void processamentoDeFatura(AluguelDeCarros aluguelDeCarros) {
        long instante1 = aluguelDeCarros.getInicio().getTime(); // getTime() pega o valor em milissegundos da minha data
        long instante2 = aluguelDeCarros.getFim().getTime();
        double horas = (double) (instante2 - instante1) / 1000 / 60 / 60; // milissengundos / 1000 = segundos / 60 =
                                                                          // minutos / 60 = hora

        double valorBasicoDePagamento;
        if (horas <= 12.0) {
            valorBasicoDePagamento = precoPorHora * Math.ceil(horas);
        } else {
            valorBasicoDePagamento = precoPorDia * Math.ceil(horas / 24);
        }

        double taxa = taxaServicos.taxa(valorBasicoDePagamento);

        aluguelDeCarros.setFatura(new Fatura(valorBasicoDePagamento, taxa));
    }
}
