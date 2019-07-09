package 线程.com;

import java.util.concurrent.TimeUnit;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-07-01 14:58:26
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

        TimeUnit.SECONDS.sleep(2);
        thread.start();
    }
}
