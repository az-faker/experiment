package java8.lambda1;

/**
 * RunableTest实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-05-21 20:13:47
 */
public class RunableTest {

    public static void runSomething() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running");
            }
        };
        new Thread(runnable).start();
    }

    public static void runSomethingByLambda() {
        new Thread(() -> System.out.println("I am running")).start();
    }


    public static void main(String[] args) {
        runSomething();
        runSomethingByLambda();
    }

    //上述代码中：
    //() -> System.out.println("I am running")就是一个lambda表达式，
    //可以看出，它是替代了new Runnable(){}这个匿名内部类。
}
