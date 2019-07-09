package 设计模式.观察者模式;

/**
 * User实体
 * 观察者
 * 实现了update方法
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-10 16:13:01
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息：" + message);
    }
}
