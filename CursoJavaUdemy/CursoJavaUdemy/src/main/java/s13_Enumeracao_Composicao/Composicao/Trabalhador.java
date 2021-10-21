package s13_Enumeracao_Composicao.Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import s13_Enumeracao_Composicao.Composicao.Enums.TrabalhadorNivel;

public class Trabalhador {
    private String nome;
    private TrabalhadorNivel nivel;
    private Double baseSalarial;

    private Departamento departamento;
    private List<HoraContratual> hora_De_Trabalho = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, TrabalhadorNivel nivel, Double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public void AdicionarContratoHora(HoraContratual contrato_por_hora) {
        hora_De_Trabalho.add(contrato_por_hora);
    }

    public void RemoverContratoHora(HoraContratual horas) {
        hora_De_Trabalho.remove(horas);
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public double valorPorPeriodo(int ano, int mes) {
        double soma = baseSalarial;
        Calendar calendario = Calendar.getInstance();
        for (HoraContratual hc : hora_De_Trabalho) {
            calendario.setTime(hc.getDate());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = 1 + calendario.get(Calendar.MONTH);
            if (c_ano == ano && c_mes == mes) {
                soma += hc.ValorTotal();
            }

        }

        return soma;
    }
}