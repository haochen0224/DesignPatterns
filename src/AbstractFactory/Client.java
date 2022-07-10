package AbstractFactory;

/**
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，
 * 也就是说必须一起创建出来。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
 *
 * 著作权归https://pdai.tech所有。
 * 链接：https://pdai.tech/md/dev-spec/pattern/5_abstract_factory.html
 *
 * 至于创建对象的家族这一概念是在 Client 体现，Client 要通过 AbstractFactory 同时调用两个方法来创建出两个对象，
 * 在这里这两个对象就有很大的相关性，Client 需要同时创建出这两个对象。
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA = factory1.createProductA();
        AbstractProductB productB = factory1.createProductB();
    }
}
