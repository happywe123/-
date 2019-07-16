package ReadAgain.设计模式.创建型.SimpleFactory;

/**
 * 说明：在创建一个对象时不向客户暴露内部实现的细节，并提供一个创建对象的通用接口
 *
 * 思路：简单工厂把实例化的操作单独放到一个类中，这个类成为简单工厂类，让简单工厂类来决定应该用哪一个具体的类进行实例化
 *
 * 优点：把客户类和具体的子类实现解耦，客户类不需要知道又那些子类以及应当实例化哪个子类。
 *      客户类有多个，如果不使用简单工厂，那么所有的客户类都要知道所有子类的实现细节
 *      一旦子类发生改变，那么所有的客户类都要进行修改
 */
public class SimpleFactory {

    public Product createProduct(int type){
        if(type == 1){
            return new ConcreteProduct1();
        }
        else if(type == 2){
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
