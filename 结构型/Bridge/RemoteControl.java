package ReadAgain.设计模式.结构型.Bridge;

public  abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel();
}
