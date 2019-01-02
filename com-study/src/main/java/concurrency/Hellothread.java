package concurrency;

/**
 * @author faker
 * @date 2018/6/28
 */
public class Hellothread extends Thread {

    @Override
    public void run() {
        System.out.println("a new thread !");
    }

    public static void main(String[] args) {
        new Hellothread().start();
    }
}
