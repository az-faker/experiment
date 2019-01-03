package aop.test;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2018-12-24 15:26:49
 */
public class Test {
    @MyTarget
    public void doSomething() {

    }

    @Resource
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test.class.getMethod("doSomething", null);
        if (method.isAnnotationPresent(MyTarget.class)) {
            System.out.println(method.getAnnotation(MyTarget.class));
        }
    }
}
