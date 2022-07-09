package FactoryMethod;

/**
 * 工厂方法模式把具体产品的创建推迟到工厂类的子类（具体工厂）中，
 * 此时工厂类不再负责所有产品的创建，而只是给出具体工厂必须实现的接口，
 * 这样工厂方法模式在添加新产品的时候就不修改工厂类逻辑而是添加新的工厂子类，符合开放封闭原则，克服了简单工厂模式中缺点
 *
 * 作者：Carson带你学安卓
 * 链接：https://www.jianshu.com/p/d0c444275827
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 客户想要产品1
         */
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        Product product1 = concreteFactory1.factoryMethod();

        /**
         * 客户想要产品2
         */
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        Product product2 = concreteFactory2.factoryMethod();
    }
}
