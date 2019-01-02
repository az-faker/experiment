package initcoll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-23 09:35:48
 */
public class Test {
    public static void main(String[] args) {

        //第一层括弧实际是定义了一个匿名内部类 (Anonymous Inner Class)，第二层括弧实际上是一个实例初始化块 (instance initializer block)，
        //这个块在内部匿名类构造时被执行。这个块之所以被叫做“实例初始化块”是因为它们被定义在了一个类的实例范围内。
        //第二个 {} 中的代码放到了构造方法中去了

        Map<String, String> map = new HashMap<String, String>(2) {
            {
                put("aaa", "aaa");
                put("bbb", "bbb");
            }
        };

        System.out.println(map);


        List<String> names = new ArrayList<String>() {
            {
                for (int i = 0; i < 10; i ++) {
                    add("A" + i);
                }
            }
        };

        System.out.println(names);

//        List<String> list = {"item"};
//        Set<String> set = {"item"};
//        Map< String, Integer> mmp = {"key" : 1};


        final int a = 1;
//        a = 10;
    }
}
