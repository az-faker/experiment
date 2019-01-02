package String;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Test1 {
    public static void main(String[] args) {

        String str = "faker";

        //编译时可以确定，可以引用字符串池中对应的字符串
        String s = "f" + "aker";

        String f = "f";

        //编译时没法确定，需要在运行时才能确定，所以不能引用字符串池
        String newStr = f + "aker";

        System.out.println(s == str);
        System.out.println(str == newStr);
    }
}
