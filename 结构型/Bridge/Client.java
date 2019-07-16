package ReadAgain.设计模式.结构型.Bridge;

/**
 * 桥接：将抽象与实现分离开，使它们可以独立变化
 */
public class Client {
    public static void main(String[] args){
        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();

        RemoteControl remoteControl2 = new ConcreteRemoteControl1(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();


    }
}
