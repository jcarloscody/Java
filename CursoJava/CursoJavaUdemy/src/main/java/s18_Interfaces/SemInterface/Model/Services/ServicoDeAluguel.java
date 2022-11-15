package s18_Interfaces.SemInterface.Model.Services;

import s18_Interfaces.SemInterface.Model.Entities.AluguelDeCarros;
import s18_Interfaces.SemInterface.Model.Entities.Fatura;

public class ServicoDeAluguel {
    private Double precoPorDia;
    private Double precoPorHora;

    private BrasilTaxaServices taxaServices;

    public ServicoDeAluguel(Double precoPorDia, Double precoPorHora, BrasilTaxaServices taxaServices) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaServices = taxaServices;
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

        double taxa = taxaServices.taxa(valorBasicoDePagamento);

        aluguelDeCarros.setFatura(new Fatura(valorBasicoDePagamento, taxa));
    }
}
