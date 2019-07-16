package ReadAgain.设计模式.行为型.Intent;

public class Alarm extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
