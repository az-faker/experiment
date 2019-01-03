package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author faker
 * @date 2018/7/2
 */
public class Test {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        String a = map.put(1, "a");
        System.out.println(a);

        String b = map.put(1, "b");
        System.out.println(b);


        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(1));

    }

}
