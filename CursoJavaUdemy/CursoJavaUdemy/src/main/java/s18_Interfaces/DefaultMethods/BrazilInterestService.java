package s18_Interfaces.DefaultMethods;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private double interestRate; // taxa de juros

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
