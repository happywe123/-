package ReadAgain.设计模式.行为型.Strategy;

public class Duck {
    private QuackBehavior quackBehavior;
    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
