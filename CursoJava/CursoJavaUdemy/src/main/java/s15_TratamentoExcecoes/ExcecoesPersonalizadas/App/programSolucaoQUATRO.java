/**SOLUÇÃO  BBOA         */

package s15_TratamentoExcecoes.ExcecoesPersonalizadas.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Entities.ReservaSolucaoQUATRO;
import s15_TratamentoExcecoes.ExcecoesPersonalizadas.Model.Exception.DomainException;

public class programSolucaoQUATRO {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Digite o numero do quarto");
            int numeroQuarto = sc.nextInt();

            System.out.println("Digite o Check-in: dd/mm/yyyy");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Digite o Check-oun: dd/mm/yyyy");
            Date checkOut = sdf.parse(sc.next());

            ReservaSolucaoQUATRO reserva = new ReservaSolucaoQUATRO(numeroQuarto, checkIn, checkOut);
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
        } catch (DomainException eDomainException) {
            System.out.println("erro nos args: " + eDomainException.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("erro no input de dados: " + e);
        }

    }
}
