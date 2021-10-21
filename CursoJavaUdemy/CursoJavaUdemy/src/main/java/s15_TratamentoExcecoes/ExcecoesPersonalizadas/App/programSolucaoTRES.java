/**SOLUÇÃO  BBOA         */

package s15_TratamentoExcecoes.ExcecoesPersonalizadas.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities.ReservaSolucaoTRES;

public class programSolucaoTRES {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ReservaSolucaoTRES reserva = new ReservaSolucaoTRES();

            System.out.println("Digite o numero do quarto");
            int numeroQuarto = sc.nextInt();

            System.out.println("Digite o Check-in: dd/mm/yyyy");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Digite o Check-oun: dd/mm/yyyy");
            Date checkOut = sdf.parse(sc.next());

            reserva = new ReservaSolucaoTRES(numeroQuarto, checkIn, checkOut);
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
        } catch (ParseException e) {
            System.out.println("erro na data");
        } catch (IllegalArgumentException eArgumentException) {
            System.out.println("erro nos args: " + eArgumentException.getMessage());
        }

    }
}
