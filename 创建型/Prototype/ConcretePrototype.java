package ReadAgain.设计模式.创建型.Prototype;

public class ConcretePrototype extends Prototype {
    private String field;

    public ConcretePrototype(String field){
        this.field = field;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}
