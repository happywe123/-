package ReadAgain.设计模式.行为型.Visitor;

public class Item implements Element {
    private String name;
    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
