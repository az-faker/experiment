package java反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author faker
 * @date 2018/7/18
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java反射.Student");

        //只能获取public属性
        Field[] fields = clazz.getFields();

//        for (Field field : fields) {
//            System.out.println(field);
//        }

        Field[] allFields = clazz.getDeclaredFields();
        for (Field fs : allFields) {
//            System.out.println(fs);

            //得到修饰符
            int i = fs.getModifiers();
            //每个数字代表一种返回值类型
            System.out.println(Modifier.toString(i) + " ");

            //类型
            Class type = fs.getType();
            System.out.println(type.getName() + " ");
            System.out.println(fs.getName() + " ");
        }
    }
}
