package 处理数据格式的工具类;

import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-02 18:13:46
 */
public class Test {

    private static final List<String> LIST;
    private static final List<Boy> BOY_LIST = new ArrayList<>();
    private static final String idStr = "1,2,s,4,5,f,9,";

    static {
        LIST = Arrays.asList("aa", "bb", "cc");
    }

    static {
        for (int i = 0; i < 3; i++) {
            Boy boy = new Boy(Long.valueOf(i), "name" + i, i, i);
            BOY_LIST.add(boy);
        }
    }

    public static void main(String[] args) {
//        testJoiner();

//        testToMap();

//        testToSet();

//        testToMap2();

        testReflex();
    }

    private static void testReflex() {
        try {
            Method method = Boy.class.getDeclaredMethod("get" + StringUtils.capitalize("age"));
            int age = (int) method.invoke(BOY_LIST.get(0));
            System.out.println(age);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void testToMap2() {
        Map<Long, String> map = BOY_LIST.stream()
                .filter(e -> StringUtils.isNotBlank(e.getName()) && null != e.getId())
                .collect(Collectors.toMap(Boy::getId, Boy::getName, (key1, key2) -> key2));
        System.out.println(map);
    }

    private static void testToSet() {
        Set<Long> ids = Stream.of(idStr.split(","))
                .filter(NumberUtils::isNumber)
                .map(Long::valueOf)
                .collect(Collectors.toSet());
        System.out.println(ids);
    }

    private static void testToMap() {
        Map<Long, String> idNameMap = BOY_LIST.stream().collect(Collectors.toMap(Boy::getId, Boy::getName));
        System.out.println(idNameMap);
    }

    private static void testJoiner() {
        String str = Joiner.on(",").join(LIST);
        System.out.println(str);
    }
}
