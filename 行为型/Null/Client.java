package ReadAgain.设计模式.行为型.Null;

/**
 * 空对象模式：使用什么都不做的空对象来代替 NULL
 */
public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation = func(-1);
        abstractOperation.request();
    }
    public static AbstractOperation func(int para) {
        if (para < 0) {
            return new NullOperation();
        }
        return new RealOperaion();
    }
}
