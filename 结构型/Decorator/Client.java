package ReadAgain.设计模式.结构型.Decorator;


/**
 * 装饰模式：为对象动态添加功能
 */
public class Client {
    public static void main(String[] args){
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
