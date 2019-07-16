package ReadAgain.设计模式.行为型.TemplateMethod;

/**
 * 模板方法：定义算法框架，并将一些步骤的实现延迟到子类
 * 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构
 */
public class Client {
    public static void main(String[] args) {
        CaffineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-----------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
