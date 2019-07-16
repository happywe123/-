package ReadAgain.设计模式.行为型.Intent;

public class Calender extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender() {
        System.out.println("doCalender()");
    }
}
