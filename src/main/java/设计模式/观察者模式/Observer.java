package 设计模式.观察者模式;

/**
 * Observer实体
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-10 16:06:17
 */
public interface Observer {

    public void update(String message);
}
