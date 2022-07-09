package SimpleFactory;

/**
 * 著作权归https://pdai.tech所有。
 * 链接：https://pdai.tech/md/dev-spec/pattern/3_simple_factory.html
 *
 * 简单工厂不是设计模式，更像是一种编程习惯。它把实例化的操作单独放到一个类中，
 * 这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。
 * 这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。
 * 因为客户类往往有多个，如果不使用简单工厂，所有的客户类都要知道所有子类的细节。
 * 而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product1 = simpleFactory.createProduct(1);
    }
}
