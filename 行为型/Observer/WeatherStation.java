package ReadAgain.设计模式.行为型.Observer;

/**
 * 观察者模式：定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionsDisplay = new
                CurrentConditionDisplay(weatherData);
        StatiscsDisplay statisticsDisplay = new StatiscsDisplay(weatherData);
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}
