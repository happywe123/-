package ReadAgain.设计模式.创建型.SimpleFactory;

public class Client {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
