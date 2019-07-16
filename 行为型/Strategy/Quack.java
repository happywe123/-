package ReadAgain.设计模式.行为型.Strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
