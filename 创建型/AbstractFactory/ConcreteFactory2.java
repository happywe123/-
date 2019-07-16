package ReadAgain.设计模式.创建型.AbstractFactory;

public class ConcreteFactory2 extends AbstractFactory {
    AbstractProductA createProductA(){
        return new ProductA2();
    }
    AbstractProductB createProductB(){
        return new ProductB2();
    }
}
