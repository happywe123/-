package ReadAgain.设计模式.行为型.Observer;

public class StatiscsDisplay implements Observer {

    public StatiscsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " +
                pressure);
    }
}
