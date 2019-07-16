package ReadAgain.设计模式.创建型.FactoryMethod;


/**
 * 说明：定义一个创建对象的接口，但由子类决定要实例化那个类。工厂方法把是实例化操作推迟到子类
 *
 * 在简单工厂的基础上，将简单工厂再抽象
 */
public  abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
    }
}
