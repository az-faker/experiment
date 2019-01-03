package java8.接口新特性;

/**
 * JDK8InterfaceImpl实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-02 16:05:11
 */
public class JDK8InterfaceImpl1 implements JDK8Interface, JDK8Interface1 {
    //实现接口后，因为默认方法不是抽象方法，所以可以不用重写，但是如果开发需要，也可以重写。


    @Override
    public void defaultMethod() {
        System.out.println("实现的2个接口中有同名方法，必须重写接口该方法");
    }
}
