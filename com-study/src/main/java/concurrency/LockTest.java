package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author faker
 * @date 2018/6/29
 */
public class LockTest {
    public static class OutPut{
        private Lock lock = new ReentrantLock();//锁对象
        public void output(String name) {
            lock.lock();//得到锁
            try {
                for (int i = 0; i < name.length(); i++) {
                    System.out.println(name.charAt(i));
                }
            } finally {
                lock.unlock();//释放锁
            }
        }
    }

    public static void main(String[] args) {
        final OutPut outPut = new OutPut();
        new Thread(new Runnable() {
            @Override
            public void run() {
                outPut.output("zhangsan");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                outPut.output("lisi");
            }
        }).start();
    }
}
