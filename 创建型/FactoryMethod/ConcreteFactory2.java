package ReadAgain.设计模式.创建型.FactoryMethod;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return (Product) new ConcreteFactory2();
    }
}
