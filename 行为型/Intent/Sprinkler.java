package ReadAgain.设计模式.行为型.Intent;

public class Sprinkler extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
