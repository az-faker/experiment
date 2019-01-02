package 设计模式.状态模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Client {
    public static void main(String[] args) {
        TvController controller = new TvController();

        controller.powerOn();

        controller.next();

        controller.up();

        controller.prev();

        controller.down();

        controller.powerOff();

        controller.next();
    }
}
