package 内部类.匿名内部类;

/**
 * Main实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-07-19 09:36:37
 */
public class Main {

    public Contents contents(int x) {
        return new Contents(x) {
            private int i = x;
            public int value() {
                System.out.println(x);
                return i;
            }
        };
    }


    public static void main(String[] args) {
        Main main = new Main();
        Contents contents = main.contents(1);
    }
}
