package 设计模式.模板设计模式;

/**
 * TemplateMethod实体
 *
 * Thread类的设计类似，调用start本地方法，start方法中会调用run方法
 *
 * @author Faker
 * @version 1.0
 * @since 2019-07-01 15:39:22
 */
public class TemplateMethod {

    public final void print(String message) {
        System.out.println("################");
        wrapPrint(message);
        System.out.println("################");
    }

    protected void wrapPrint(String message) {

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };
        t1.print("Hello Thread");

        TemplateMethod t2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };
        t2.print("Hello Thread");
    }
}
