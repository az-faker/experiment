package spring.postConstruct;

/**
 * 实例Test
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-13 10:07:00
 */
public class Test {
    public static void main(String[] args) {
        AAA a = new AAA();
        String aaa = "aaa";
        String bbb = "bbb";
        System.out.println(a + aaa + bbb);
    }

    public void test(final AAA aaa) {
        aaa.setB(new BBB());
    }
}
