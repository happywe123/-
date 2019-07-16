package ReadAgain.设计模式.创建型.FactoryMethod;

public class ConcreteFactory extends Factory {


    public Product factoryMethod() {
        Product product = (Product) new ConcreteProduct();
        return product;
    }
}
