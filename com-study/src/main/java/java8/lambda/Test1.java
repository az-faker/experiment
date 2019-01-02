package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Test1实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-22 08:18:40
 */
public class Test1 {
    private static List<String> list =
            Arrays.asList("my", "name", "is", "uber", "and", "uc");

    public static void oldSort(List<String> list) {
        //排序
        Collections.sort(list, new Comparator<String>() {
            //使用新的排序规则 根据第二个字符进行逆序排
            @Override
            public int compare(String a, String b) {
                if (a.charAt(1) <= b.charAt(1)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public static void newSort(List<String> list) {
        //lambda会自动推断出 a,b 的类型
        Collections.sort(list, (a, b) -> a.charAt(1) < b.charAt(1) ? 1 : -1);
    }

    public static void main(String[] args) {
        System.out.println(list);
//      oldSort(list);
        newSort(list);
        System.out.println(list);
    }
}
