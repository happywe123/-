package ReadAgain.设计模式.创建型.AbstractFactory;

/**
 * 提供一个接口，用于创建相关的对象家族
 */
public class Client {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
    }
}
