package ReadAgain.设计模式.创建型.FactoryMethod;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return (Product) new ConcreteProduct1();
    }
}
