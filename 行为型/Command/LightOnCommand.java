package ReadAgain.设计模式.行为型.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }
}
