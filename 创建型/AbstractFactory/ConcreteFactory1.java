package ReadAgain.设计模式.创建型.AbstractFactory;

public class ConcreteFactory1 extends AbstractFactory {
    AbstractProductA createProductA(){
        return new ProductA1();
    }
    AbstractProductB createProductB(){
        return new ProductB1();
    }
}
