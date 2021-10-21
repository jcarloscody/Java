/**SOLUÇÃO MUITO RUIM         */

package s15_TratamentoExcecoes.ExcecoesPersonalizadas.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities.ReservaSolucaoUM;

public class programSolucaoUM {
    public static void main(String[] args) throws ParseException {
        /*
         * throws: dentro do metodo main tem uma chamada "sdf.parse" que pode gerar uma
         * excecao, o compilador vai reclamar para eu tratar a excecao ou propagar a
         * excecao no metodo onde eu estou, ou seja, se usar o throws ParseException
         * então eu estou avisando ao metodo main sobre a desnecessidade do tratamento
         * da excecao, entao se a excecao surgir, a excecao sera propagada nesse metodo,
         * entao se porventura houvesse outro metodo X que chamasse esse metodo main ,
         * esse metodo X deveria tratar essa excecao que surgisse ou propagar tbm ISSO É
         * A PILHA DE CHAMADA DE METODO.
         */

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o numero do quarto");
        int numeroQuarto = sc.nextInt();

        System.out.println("Digite o Check-in: dd/mm/yyyy");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Digite o Check-oun: dd/mm/yyyy");
        Date checkOut = sdf.parse(sc.next());

        ReservaSolucaoUM reserva = new ReservaSolucaoUM(numeroQuarto, checkIn, checkOut);
        System.out.println("Reserva: " + reserva);

        System.out.println("");
        System.out.println("");
        System.out.println("ATUALIZAÇÃO *******");
        System.out.println("Digite o Check-in: dd/mm/yyyy");
        checkIn = sdf.parse(sc.next());
        System.out.println("Digite o Check-oun: dd/mm/yyyy");
        checkOut = sdf.parse(sc.next());

        reserva.atualizacaoCheckInCheckOut(checkIn, checkOut);
        System.out.println("Reserva: " + reserva);
        sc.close();
    }
}
