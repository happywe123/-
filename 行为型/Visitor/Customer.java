package ReadAgain.设计模式.行为型.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Element {
    private String name;
    private List<Order> orders = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }

}
