package list接口;

import java.util.ArrayList;
import java.util.List;

/**
 * 实例Test
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-06 06:38:30
 */
public class Test {
    public static void makeList1(List<Integer> list, int n) {
        list.clear();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }

    public static void makeList2(List<Integer> list, int n) {
        list.clear();
        for (int i = 0; i < n; i++) {
            list.add(0, i);
        }
    }

    public static int sum(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ((ArrayList) list).ensureCapacity(10);
        list.add(12);
        ((ArrayList)list).trimToSize();
        System.out.println(list.size());
    }
}
