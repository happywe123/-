package ReadAgain.设计模式.结构型.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("extrinsicState: " + extrinsicState);
    }
}
