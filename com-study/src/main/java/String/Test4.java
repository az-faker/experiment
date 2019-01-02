package String;

/**
 * Test4实体
 *
 * @author Faker
 * @version 1.0
 * @since 2018-08-31 09:47:20
 */
public class Test4 {
    public static void main(String[] args) {
//        testString();

        testNumToString();
    }

    /**
     * String.valueOf()直接调用了底层的Integer.toString()方法，不过其中会先判空；+”“由StringBuilder实现，先调用了append()方法，
     * 然后调用了toString()方法获取字符串；num.toString()直接调用了Integer.toString()方法，所以效率是:num.toString()方法最快，其次是String.valueOf(num)，最后是num+”“的方式。
     *
     * 建议童鞋们避免使用+”“的方式转换，最好是使用基本数据类型自带的toString()方法转换。
     */
    private static void testNumToString() {
        Integer num = 0;
        int loop = 100000;

        long begin = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            String s = num + "";
        }
        long end = System.currentTimeMillis();
        System.out.println("+\"\"的方式耗时：" + (end - begin) + "ms");

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            String s = String.valueOf(num);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String.valueOf()的方式耗时：" + (end1 - begin1) + "ms");

        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            String s = num.toString();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("toString()的方式耗时：" + (end2 - begin2) + "ms");
    }


    /**
     * 如下所示，使用+号拼接字符串，其效率明显较低，而使用StringBuffer和StringBuilder的
     *
     * append()方法进行拼接，效率是使用+号拼接方式的百倍甚至千倍，而StringBuffer的效率
     *
     * 比StringBuilder低些，这是由于StringBuffer实现了线程安全，效率较低也是不可避免的。
     *
     * 所以在字符串的累加操作中，建议结合线程问题选择，应避免使用+号拼接字符串。
     *
     *
     * 下例中也使用过StringBuffer和StringBuilder了，两者只有线程安全方面的差别，所以呢，在无需考虑线程安全的情况下，建议使用性能相对较高的StringBuilder类，若系统要求线程安全，就选择StringBuffer类。
     */
    private static void testString() {
        String s = "";
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += "s";
        }
        long end = System.currentTimeMillis();
        System.out.println("String拼接耗时：" + (end - begin));

        StringBuffer sb = new StringBuffer();
        long sbBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("s");
        }
        long sbEnd = System.currentTimeMillis();
        System.out.println("StringBuffer拼接耗时：" + (sbEnd - sbBegin));

        StringBuilder ssb = new StringBuilder();
        long ssbBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ssb.append("s");
        }
        long ssbEnd = System.currentTimeMillis();
        System.out.println("StringBuilder拼接耗时：" + (ssbEnd - ssbBegin));
    }
}
