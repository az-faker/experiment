package aop;

/**
 * @author faker
 * @date 2018/6/29
 */
public class Test {

    @FakerAnnotation
    public static void say() {
        System.out.println("test-------------");
    }

    public static void main(String[] args) {
        say();
    }
}
