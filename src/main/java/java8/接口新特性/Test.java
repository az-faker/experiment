package java8.接口新特性;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-02 15:36:09
 */
public class Test {
    public static void main(String[] args) {
        //静态方法直接用接口名调用
        JDK8Interface.staticMethod();

        //默认方法需要实例掉调用
        new JDK8InterfaceImpl().defaultMethod();
    }
}
