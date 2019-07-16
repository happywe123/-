package ReadAgain.设计模式.结构型.Facade;

public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
