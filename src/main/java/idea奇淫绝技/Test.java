package idea奇淫绝技;

import java.util.Arrays;
import java.util.List;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-04-08 18:29:37
 */
public class Test {
    public static void main(String[] args) {
        //"jack".var
        String jack = "jack";

        //20.var
        int i = 20;
    }

    public static String postfix(Object user) {
        //user.null
        if (user == null) {

        }

        //user.notnull
        if (user != null) {

        }

        //user.nn
        if (user != null) {

        }

        //list.for
        List<String> list = Arrays.asList("a", "b", "c");
        for (String s : list) {

        }

        //isSuccess.not
        boolean isSuccess = true;
        isSuccess = !isSuccess;

        //list.size() > 0.if
        if (list.size() > 0) {

        }

        //name.cast
        Object name = "jack";
        String faker = ((String) name);

        //"Abc".return
        return "Abc";
    }
}
