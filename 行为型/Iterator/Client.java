package ReadAgain.设计模式.行为型.Iterator;

/**
 * 迭代器模式：提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
