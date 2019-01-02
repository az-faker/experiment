package 基本类型;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Test {

    public static void main(String[] args) {
//        short s1 = 1;
//        s1 += 1;//这种方式隐含强制类型转换


        int i = 10;

        switch (i) {
            case 1:System.out.println("1");
            case 10:System.out.println("10");
            case 0:System.out.println("0");
            case 2:System.out.println("2");break;
            default:System.out.println("default");
        }
    }
}
