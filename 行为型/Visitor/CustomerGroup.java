package ReadAgain.设计模式.行为型.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {
    private List<Customer> customers = new ArrayList<>();
    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }
    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
