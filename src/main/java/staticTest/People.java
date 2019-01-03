package staticTest;

/**
 * @author faker
 * @date 2018/6/26
 */
public class People {
    private static int age = 10;

    private String name;


    public static void main(String[] args) {
        System.out.println(People.age);
        People.age = 100;
        System.out.println(People.age);
    }

    static {
        System.out.println("父类静态块");
    }

    public People() {
        System.out.println("父类构造方法");
    }

}
