package java8.接口新特性;

/**
 * JDK8Interface实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-02 15:35:57
 */
public interface JDK8Interface {
    static void staticMethod() {
        System.out.println("接口中的静态方法");
    }

    default void defaultMethod() {
        System.out.println("接口中的默认方法");
    }
}
