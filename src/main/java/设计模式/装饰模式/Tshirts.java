package 设计模式.装饰模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Tshirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
