package concurrency;

/**
 * @author faker
 * @date 2018/6/28
 */
public class DeadLockTest {
    private static Object A = new Object(), B = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    System.out.println("线程1拿到A");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("线程1拿到B");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    System.out.println("线程2拿到b");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (A) {
                        System.out.println("线程2拿到A");
                    }
                }
            }
        }).start();
    }
}
