package exception;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2018-10-15 10:16:06
 */
public class Test {
    public static void main(String[] args) {
        try {
            int a = 1/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
