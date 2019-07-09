package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * WechatServer实体
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-10 16:08:55
 */
public class WechatServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WechatServer() {
        this.list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
