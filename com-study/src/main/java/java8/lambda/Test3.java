package java8.lambda;

import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Test3实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-22 08:46:20
 */
public class Test3 {
    private static List<Integer> list = Arrays.asList(20, 300, 1, 4000);
    private static String names = "baidu,alibaba,tencent,haodf,google,cctv,google";

    public static void main(String[] args) {
//        testSort();
//        testMan();
        testStream();
    }

    private static void testStream() {
        List<String> nameList = Stream.of(names.split(","))
                .filter(StringUtils::isNotBlank)
//                .limit(2)
                .sorted()
//                .skip(2)
                .distinct()
                .map(str -> str.substring(0, 3))
                .collect(Collectors.toList());
//        System.out.println(nameList);

        Set<String> nameSet = Stream.of(names.split(","))
                .filter(StringUtils::isNotBlank)
                .map(str -> str.substring(0, 3))
                .collect(Collectors.toSet());
//        System.out.println(nameSet);
//
//        System.out.println(Joiner.on(",").join(nameSet));

        String sql = String.format("select * from user where id in (%s)", Joiner.on(",").join(list));
        System.out.println(sql);
    }

    private static void testMan() {
        List<Man> manList = new ArrayList<>();
        for (int i = 3; i > 0; i--) {
            Man man = new Man();
            man.setAge(i);
            man.setName("name" + i);
            manList.add(man);
        }
        manList.forEach(System.out::println);


        Map<Integer, String> ageNameMap = manList.stream()
                .filter(single -> single.getAge() != null)
                .collect(Collectors.toMap(Man::getAge, Man::getName));

        ageNameMap.forEach((k, v) -> {
            System.out.println(String.format("age:%d, name%s", k, v));
        });
    }

    private static void testSort() {
        list.forEach(System.out::println);
        list.forEach(e -> {
            System.out.println(e);
        });
        list.sort((a, b) -> a > b ? 1 : -1);
        list.forEach(System.out::println);
    }
}
