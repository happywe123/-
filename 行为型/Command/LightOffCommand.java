package ReadAgain.设计模式.行为型.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();

    }
}
