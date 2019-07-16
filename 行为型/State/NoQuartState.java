package ReadAgain.设计模式.行为型.State;

public class NoQuartState implements State {
    GumbalMachine gumballMachine;
    public NoQuartState(GumbalMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
