package ReadAgain.设计模式.结构型.Facade;

public class SubSystem {
    public void turnOnTV(){
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd){
        System.out.println("setCD(" + cd + ")");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }

}
