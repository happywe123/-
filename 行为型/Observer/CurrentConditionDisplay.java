package ReadAgain.设计模式.行为型.Observer;

public class CurrentConditionDisplay implements Observer{

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    } @
            Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " +
                pressure);
    }

}
