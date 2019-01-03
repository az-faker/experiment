package staticTest;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Man extends People {

    static {
        System.out.println("子类静态块");
    }

    public Man() {
        super();
        System.out.println("子类构造方法");
    }
}
