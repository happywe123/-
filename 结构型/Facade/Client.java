package ReadAgain.设计模式.结构型.Facade;

/**
 * 外观：提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用
 */
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
