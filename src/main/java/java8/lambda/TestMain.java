package java8.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * TestMain实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-25 17:27:24
 */
public class TestMain {


    //无参数，无返回值
    public static void test1() {
        int num = 0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!" + num);
            }
        };

        r.run();

        System.out.println("--------------------------------------");

        //无参数，无返回值
        Runnable r1 = () -> System.out.println("Hello lambda!" + (num + 1));
        r1.run();
    }

    //有一个参数，并且无返回值
    public static void test2() {
        Consumer<String> con = x -> System.out.println(x);
        con.accept("faker is niubility");

        Comparator<Integer> comparable = (Integer x, Integer y) -> Integer.compare(x, y);
    }

    @FunctionalInterface
    public static interface MyFun{
        public Integer getValue(Integer num);
    }

    public static Integer operation(Integer num, MyFun mf) {
        return mf.getValue(num);
    }



    public static void main(String[] args) {
        Integer num = operation(100, (x) -> x * x);
    }
}
