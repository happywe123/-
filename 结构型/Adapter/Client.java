package ReadAgain.设计模式.结构型.Adapter;

/**
 * 将一个类接口转换成另一个用户的接口
 */
public class Client {
    public static void main(String[] args){
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
