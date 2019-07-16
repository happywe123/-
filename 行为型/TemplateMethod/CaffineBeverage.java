package ReadAgain.设计模式.行为型.TemplateMethod;

public abstract class CaffineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("boilWater");
    }
    void pourInCup() {
        System.out.println("pourInCup");
    }
}
