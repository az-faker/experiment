package 线程;

/**
 * @author faker
 * @date 2018/7/11
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //获取当前线程
            System.out.println(Thread.currentThread().getName() + "___" + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
