package 范型;

/**
 * @author faker
 * @date 2018/7/26
 */
public class RunTimeTest extends Object {
    private int ss;
    private String aaa;



    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    public RunTimeTest(int a) {

    }

    public RunTimeTest() {
        System.out.println("sssssss");
    }

    {
        ss = 1;
    }

    public static void main(String[] args) {
        int x = 65;
        char ch = (char) x;

        String str = "hello";
        String s = new String("hello");
        System.out.println(str.equals(s));

    }
}
