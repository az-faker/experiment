package java反射;

/**
 * @author faker
 * @date 2018/7/18
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java反射.Student");
        Object obj = clazz.newInstance();

        System.out.println(obj);
    }
}
