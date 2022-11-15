package s18_Interfaces.DefaultMethods;

import java.util.Locale;
import java.util.Scanner;

import s18_Interfaces.SemInterface.Model.Services.BrasilTaxaServices;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount: ");
        double amout = scanner.nextDouble();

        System.out.println("Months: ");
        int months = scanner.nextInt();

        InterestService brazilInterestService = new BrazilInterestService(2.0);
        double payment = brazilInterestService.payment(amout, months);

        System.out.println("Payment after: " + months + " months: ");
        System.out.println(String.format("$.2f", payment));

        scanner.close();
    }
}
