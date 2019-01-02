package cycle;

/**
 * @author faker
 * @date 2018/6/29
 */
public class Test {
    public static void main(String[] args) {
        tag:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(j + i);
                if (i == 5) {
                    break tag;
                }
            }
        }
    }
}
