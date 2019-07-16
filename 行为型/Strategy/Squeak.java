package ReadAgain.设计模式.行为型.Strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
