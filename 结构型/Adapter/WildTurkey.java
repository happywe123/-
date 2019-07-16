package ReadAgain.设计模式.结构型.Adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
