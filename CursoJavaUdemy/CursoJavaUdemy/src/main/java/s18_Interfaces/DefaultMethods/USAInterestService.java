package s18_Interfaces.DefaultMethods;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService {
    private double interestRate; // taxa de juros

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
