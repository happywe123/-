package ReadAgain.设计模式.行为型.Visitor;

public interface Visitor {
    void visit(Customer customer);
    void visit(Order order);
    void visit(Item item);
}
