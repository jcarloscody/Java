package s18_Interfaces.DefaultMethods;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate(); // esse metodo não será um default, pq esse metodo retorna um estado, um
                              // atributo lá na classe que implementa esse metodo

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);

    }
}
