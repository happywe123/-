package ReadAgain.设计模式.结构型.Decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
