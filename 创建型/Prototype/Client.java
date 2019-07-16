package ReadAgain.设计模式.创建型.Prototype;


/**
 * 原型模式：使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象
 */
public class Client {
    public static void main(String[] args){
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
