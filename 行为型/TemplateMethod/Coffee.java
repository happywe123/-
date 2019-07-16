package ReadAgain.设计模式.行为型.TemplateMethod;

public class Coffee extends CaffineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
