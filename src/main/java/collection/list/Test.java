package collection.list;

import java.util.Arrays;
import java.util.List;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-06-27 10:34:15
 */
public class Test {

    private static String[] arr = {"faker", "uzi", "doublelift", "ambition"};

    public static void main(String[] args) {
        test2();
    }

    /**
     * Array转ArrayList
     */
    private static void test1() {
        List<String> list = Arrays.asList(arr);
        System.out.println(list.getClass());

        System.out.println(list.get(2));

        list.set(0, "jacklove");
        System.out.println(list);

        //会报错
        //Arrays.asList()会返回一个ArrayList，但是要特别注意，这个ArrayList是Arrays类的静态内部类，并不是java.util.ArrayList类。java.util.Arrays.ArrayList类实现了set()， get()，contains()方法，但是并没有实现增加元素的方法（事实上是可以调用add方法，但是没有具体实现，仅仅抛出UnsupportedOperationException异常），因此它的大小也是固定不变的。
        list.add("rookie");
    }

    /**
     * 判断一个数组是否包含某个值
     */
    private static void test2() {
        System.out.println(Arrays.asList(arr).contains("uzi"));
    }
}
