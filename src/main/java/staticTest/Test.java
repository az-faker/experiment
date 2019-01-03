package staticTest;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Test {
//    public static void main(String[] args) {
////        Man man = new Man();
//
//        int a = 1;
//        int b = 1;
//
//        go(a++, ++b);
//
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//
//
//    }

    private static void go(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public int aaa() {
        int x = 1;

        try {
            return ++x;
        } catch (Exception e) {

        } finally {
            ++x;
        }
        return x;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int y = t.aaa();
        System.out.println(y);
    }
}
