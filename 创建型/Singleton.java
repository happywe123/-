package ReadAgain.设计模式.创建型;

/**
 *  说明：确保一个类只有一个实例，并提供该实例的全局访问点
 *
 *  思路：使用一个私有构造函数、一个私有静态变量以及一个公有静态函数实现
 */
public class Singleton {

    //懒汉式-线程不安全
    //private static Singleton uniqueInstance;

    //饿汉式-线程安全
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){

    }

    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
