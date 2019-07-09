package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author faker
 * @date 2018/7/2
 */
public class Test {

    public static void main(String[] args) {
        test();
//        test1();
    }

    private static void test1() {
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


    public static void test() {
        Map<String, Object> map = new HashMap<>();
        map.put("Faker", "Faker");
        map.put("Uiz", "Uzi");
        map.put("Kobe", "kobe");

        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            String key = entry.getKey();
            if (!key.equals(key.toLowerCase())) {
                it.remove();
//                map.put(entry.getKey().toLowerCase(), entry.getValue());
            }
        }

        System.out.println(map);
    }

}
