package java8.lambda;

/**
 * Test实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-22 08:10:20
 */
public class Test {

    public static void main(String[] args) {
        runSth();
        runSthLambda();
    }

    private static void runSth() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am running");
            }
        };
        new Thread(runnable).start();
    }

    /**
     * () -> System.out.println("I am running")就是一个lambda表达式，
     * 可以看出，它是替代了new Runnable(){}这个匿名内部类。
     *
     */
    private static void runSthLambda() {
        new Thread(() -> System.out.println("i am running")).start();
    }

}
