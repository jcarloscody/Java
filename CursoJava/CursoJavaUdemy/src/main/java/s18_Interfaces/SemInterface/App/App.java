package s18_Interfaces.SemInterface.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import s18_Interfaces.SemInterface.Model.Entities.AluguelDeCarros;
import s18_Interfaces.SemInterface.Model.Entities.Veiculo;
import s18_Interfaces.SemInterface.Model.Services.BrasilTaxaServices;
import s18_Interfaces.SemInterface.Model.Services.ServicoDeAluguel;

public class App {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        Date finish = sdf.parse(sc.nextLine());

        AluguelDeCarros aluguelDeCarros = new AluguelDeCarros(start, finish, new Veiculo(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(pricePerDay, pricePerHour, new BrasilTaxaServices());

        servicoDeAluguel.processamentoDeFatura(aluguelDeCarros);

        System.out.println("INVOICE:");
        System.out.println(
                "Basic payment: " + String.format("%.2f", aluguelDeCarros.getFatura().getValorBasicoDePagamento()));
        System.out.println("Tax: " + String.format("%.2f", aluguelDeCarros.getFatura().getTaxa()));
        System.out.println("Total payment: " + String.format("%.2f", aluguelDeCarros.getFatura().getTotalPagamento()));

        sc.close();
    }
}
