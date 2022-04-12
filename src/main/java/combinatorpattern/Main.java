package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+2345463243",
                LocalDate.of(2000, 1, 1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValid(customer));
    }
}
