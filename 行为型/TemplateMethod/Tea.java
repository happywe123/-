package ReadAgain.设计模式.行为型.TemplateMethod;

public class Tea extends CaffineBeverage {

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
