package 线程;

/**
 * @author faker
 * @date 2018/7/11
 */
public class MyRunnable implements Runnable {
    int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "___" + i + "ticket___" + ticket--);
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.start();
        t2.start();
        t3.start();
    }
}
