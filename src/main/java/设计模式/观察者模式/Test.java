package 设计模式.观察者模式;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-10 16:14:59
 */
public class Test {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("张三");
        Observer userLi = new User("李四");
        Observer userWang = new User("王五");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);

        server.setInformation("PHP是世界上最好的语言！");

        System.out.println("-------------------------------------------------");
        server.removeObserver(userZhang);
        server.setInformation("Java是世界上最好的语言！");
    }
}
