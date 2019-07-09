package 包装类型;

import java.lang.reflect.Field;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-04-25 16:37:23
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Integer a = 1, b = 2;
        System.out.println(a + "" + b);
        swap(a, b);
        System.out.println(a + "" + b);
    }

    public static void swap(Integer value1, Integer value2) throws Exception {
        //反射获取value属性对象
        Field declaredField = Integer.class.getDeclaredField("value");
        declaredField.setAccessible(true);
        //这一步很重要，决定是不是从缓存中取，一定不能Integer val = value1.intValue();这么写
        Integer val = new Integer(value1.intValue());
        declaredField.set(value1, value2);
        declaredField.set(value2, val);
    }
}
