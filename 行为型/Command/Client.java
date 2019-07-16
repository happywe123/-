package ReadAgain.设计模式.行为型.Command;

/**
 * 命令模式：将命令封装成对象：
 * 使用命令来参数化对象
 * 将命令放入队列中进行排队
 * 将命令的操作记录到日志中
 * 支持可撤销的操作
 */
public class Client {
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        invoker.setOnCommand(lightOnCommand,0);
        invoker.setOffCommand(lightOffCommand, 0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
