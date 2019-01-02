package 设计模式.装饰模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component == null) {
            super.show();
        }
    }
}
