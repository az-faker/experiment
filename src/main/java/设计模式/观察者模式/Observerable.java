package 设计模式.观察者模式;


/**
 * Observerable实体
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-10 16:04:23
 */
public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
