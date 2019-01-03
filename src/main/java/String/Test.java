package String;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Test {
    public static void main(String[] args) {
        String newStr = new String("faker");

        String str1 = "faker";

        String str2 = "faker";

        System.out.println(str1 == str2);

        System.out.println(newStr == str1);
    }
}
