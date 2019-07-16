package ReadAgain.设计模式.行为型.State;

public class HasQuarterState implements State {
    private GumbalMachine gumballMachine;
    public HasQuarterState(GumbalMachine gumballMachine) {this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
