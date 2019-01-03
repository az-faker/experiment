package staticTest;

/**
 * @author faker
 * @date 2018/6/28
 */
public class HelloWorld {
    static String hobby = "faker";

    public static void main(String[] args) {
        System.out.println(HelloWorld.hobby);

        HelloWorld hello = new HelloWorld();
        System.out.println(hello.hobby);

        //可以被修改
        hello.hobby = "uzi";
        System.out.println(hello.hobby);
        System.out.println(HelloWorld.hobby);
    }
}
