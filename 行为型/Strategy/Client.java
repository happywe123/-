package ReadAgain.设计模式.行为型.Strategy;

/**
 * 策略模式：定义一系列算法，封装每个算法，并使它们可以互换
 * 策略模式可以让算法独立于使用他们的客户端
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
