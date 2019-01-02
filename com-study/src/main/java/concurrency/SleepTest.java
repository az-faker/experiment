package concurrency;

/**
 * @author faker
 * @date 2018/6/28
 */
public class SleepTest {

    public static void main(String[] args) throws InterruptedException{
        String[] arr = {"faker", "uzi", "loving"};

        for (int i = 0; i < arr.length; i++) {
            Thread.sleep(3000);
            System.out.println(arr[i]);
        }
    }
}
